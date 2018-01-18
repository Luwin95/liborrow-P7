package org.liborrow.webservice.model.transformer.impl;

import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.transformer.contract.BorrowTransformer;

public class BorrowTransformerImpl implements BorrowTransformer {
	
	@Override
	public BorrowDTO toBorrowDTO(Borrow borrow, boolean isParent) {
		BorrowDTO borrowTransformed = new BorrowDTO();
		borrowTransformed.setId(borrow.getId());
		borrowTransformed.setEndDate(borrow.getEndDate());
		borrowTransformed.setGetBackDate(borrow.getGetBackDate());
		borrowTransformed.setExtended(borrow.getExtended());
		borrowTransformed.setStartDate(borrow.getStartDate());
		if(borrow.getItems() != null && isParent)
		{
			
		}
		if(borrow.getBorrower()!=null && isParent)
		{
			
		}
		return borrowTransformed;
	}
	
	@Override
	public Set<BorrowDTO> toBorrowsDTO(Set<Borrow> borrows, boolean isParent) {
		Set<BorrowDTO> borrowsTransformed = new HashSet<>();
		for(Borrow borrow : borrows)
		{
			borrowsTransformed.add(toBorrowDTO(borrow, isParent));
		}
		return borrowsTransformed;
	}

}
