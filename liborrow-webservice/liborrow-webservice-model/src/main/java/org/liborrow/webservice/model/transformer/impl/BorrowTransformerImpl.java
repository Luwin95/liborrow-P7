package org.liborrow.webservice.model.transformer.impl;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.dto.ItemDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.Magazine;
import org.liborrow.webservice.model.entities.UserLight;
import org.liborrow.webservice.model.transformer.contract.BookTransformer;
import org.liborrow.webservice.model.transformer.contract.BorrowTransformer;
import org.liborrow.webservice.model.transformer.contract.MagazineTransformer;
import org.liborrow.webservice.model.transformer.contract.UserLightTransformer;
import org.liborrow.webservice.model.utilsobject.AuthorDependenciesEnum;


public class BorrowTransformerImpl implements BorrowTransformer {
	
	@Override
	public BorrowDTO toBorrowDTO(Borrow borrow, boolean isParent, String classParentName) {
		BorrowDTO borrowTransformed = new BorrowDTO();
		borrowTransformed.setId(borrow.getId());
		Calendar cal = Calendar.getInstance();
		cal.setTime(borrow.getStartDate());
		int nbMonth = borrow.getExtended() ? 2 : 1;
		cal.add(Calendar.MONTH, nbMonth);
		borrowTransformed.setEndDate(cal.getTime());
		borrowTransformed.setGetBackDate(borrow.getGetBackDate());
		borrowTransformed.setExtended(borrow.getExtended());
		borrowTransformed.setStartDate(borrow.getStartDate());
		if(borrow.getBook().isPresent() && (isParent||classParentName.equals(UserLight.class.getSimpleName())))
		{
			BookTransformer bookTransformer = new BookTransformerImpl();
			borrowTransformed.setBookDTO(bookTransformer.toBookDTO(borrow.getBook().get(), false, Borrow.class.getSimpleName()));
		}
		if(borrow.getMagazine().isPresent() && (isParent||classParentName.equals(UserLight.class.getSimpleName())))
		{
			MagazineTransformer magazineTransformer = new MagazineTransformerImpl();
			borrowTransformed.setMagazineDTO(magazineTransformer.toMagazineDTO( borrow.getMagazine().get(), false, Borrow.class.getSimpleName()));
		}
		if(borrow.getBorrower()!=null && (isParent||classParentName.equals(Magazine.class.getSimpleName())||classParentName.equals(Book.class.getSimpleName())))
		{
			UserLightTransformer userLightTransformer = new UserLightTransformerImpl();
			borrowTransformed.setBorrower(userLightTransformer.toUserLightDto( borrow.getBorrower(), false, Borrow.class.getSimpleName()));
		}
		return borrowTransformed;
	}
	
	@Override
	public Set<BorrowDTO> toBorrowsDTO(Set<Borrow> borrows, boolean isParent, String classParentName) {
		Set<BorrowDTO> borrowsTransformed = new HashSet<>();
		for(Borrow borrow : borrows)
		{
			borrowsTransformed.add(toBorrowDTO(borrow, isParent, classParentName));
		}
		return borrowsTransformed;
	}
	
	@Override
	public Borrow toBorrowEntity(BorrowDTO borrow, boolean isParent, String classParentName) {
		Borrow borrowTransformed = new Borrow();
		borrowTransformed.setId(borrow.getId());
		borrowTransformed.setGetBackDate(borrow.getGetBackDate());
		borrowTransformed.setExtended(borrow.getExtended());
		borrowTransformed.setStartDate(borrow.getStartDate());
		if(borrow.getBookDTO() !=null && (isParent||classParentName.equals(UserLight.class.getSimpleName())))
		{
//			borrowTransformed.setIdItem(borrow.getBookDTO().getId());
			BookTransformer bookTransformer = new BookTransformerImpl();
			borrowTransformed.setBook(bookTransformer.toBookEntity(borrow.getBookDTO(), false, Borrow.class.getSimpleName()));
		}
		if(borrow.getMagazineDTO() !=null && (isParent||classParentName.equals(UserLight.class.getSimpleName())))
		{
//			borrowTransformed.setIdItem(borrow.getMagazineDTO().getId());
			MagazineTransformer magazineTransformer = new MagazineTransformerImpl();
			borrowTransformed.setMagazine(magazineTransformer.toMagazineEntity( borrow.getMagazineDTO(), false, Borrow.class.getSimpleName()));
		}
		if(borrow.getBorrower()!=null && (isParent||classParentName.equals(Magazine.class.getSimpleName())||classParentName.equals(Book.class.getSimpleName())))
		{
			UserLightTransformer userLightTransformer = new UserLightTransformerImpl();
			borrowTransformed.setBorrower(userLightTransformer.toUserLightEntity( borrow.getBorrower(), false, Borrow.class.getSimpleName()));
		}
		return borrowTransformed;
	}
	
	@Override
	public Set<Borrow> toBorrowsEntities(Set<BorrowDTO> borrows, boolean isParent, String classParentName) {
		Set<Borrow> borrowsTransformed = new HashSet<>();
		for(BorrowDTO borrow : borrows)
		{
			borrowsTransformed.add(toBorrowEntity(borrow, isParent, classParentName));
		}
		return borrowsTransformed;
	}
}
