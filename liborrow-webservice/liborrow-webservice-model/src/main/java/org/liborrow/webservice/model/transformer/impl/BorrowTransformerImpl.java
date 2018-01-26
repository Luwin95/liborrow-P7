package org.liborrow.webservice.model.transformer.impl;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.dto.ItemDTO;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.transformer.contract.BorrowTransformer;


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
		if(borrow.getItem() !=null)
		{
			borrowTransformed.setItemDTO(new ItemDTO());
			borrowTransformed.getItemDTO().setId(borrow.getItem().getId());
			borrowTransformed.getItemDTO().setItemType(borrow.getItem().getItemType());
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
		Calendar cal = Calendar.getInstance();
		cal.setTime(borrow.getStartDate());
		int nbMonth = borrow.getExtended() ? 2 : 1;
		cal.add(Calendar.MONTH, nbMonth);
		borrowTransformed.setEndDate(cal.getTime());
		borrowTransformed.setGetBackDate(borrow.getGetBackDate());
		borrowTransformed.setExtended(borrow.getExtended());
		borrowTransformed.setStartDate(borrow.getStartDate());
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
