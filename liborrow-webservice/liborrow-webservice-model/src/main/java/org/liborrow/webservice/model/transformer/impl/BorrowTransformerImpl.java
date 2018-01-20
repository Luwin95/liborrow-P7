package org.liborrow.webservice.model.transformer.impl;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.transformer.contract.BookTransformer;
import org.liborrow.webservice.model.transformer.contract.BorrowTransformer;
import org.liborrow.webservice.model.transformer.contract.MagazineTransformer;
import org.liborrow.webservice.model.transformer.contract.UserLightTransformer;

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
		if(borrow.getBooks() != null && (isParent||classParentName.equals("UserDTO")||classParentName.equals("org.liborrow.webservice.model.dto.UserLightDTO")))
		{
			BookTransformer bookTransformer = new BookTransformerImpl();
			borrowTransformed.setBooks(bookTransformer.toBooksDTO(borrow.getBooks(), false, borrowTransformed.getClass().getName()));
		}
		if(borrow.getMagazines() != null && (isParent||classParentName.equals("UserDTO")||classParentName.equals("org.liborrow.webservice.model.dto.UserLightDTO")))
		{
			MagazineTransformer magazineTransformer = new MagazineTransformerImpl();
			borrowTransformed.setMagazines(magazineTransformer.toMagazinesDTO(borrow.getMagazines(), false, borrowTransformed.getClass().getName()));
		}
		if(borrow.getBorrower()!=null && (isParent||classParentName.equals("BookDTO")||classParentName.equals("org.liborrow.webservice.model.dto.MagazineDTO")))
		{
			UserLightTransformer userLightTransformer = new UserLightTransformerImpl();
			borrowTransformed.setBorrower(userLightTransformer.toUserLightDto(borrow.getBorrower(), false, borrowTransformed.getClass().getName()));
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

}
