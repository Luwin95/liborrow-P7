package org.liborrow.webservice.model.transformer.impl;

import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.MagazineDTO;
import org.liborrow.webservice.model.entities.Magazine;
import org.liborrow.webservice.model.transformer.contract.BorrowTransformer;
import org.liborrow.webservice.model.transformer.contract.ImageTransformer;
import org.liborrow.webservice.model.transformer.contract.MagazineTransformer;

public class MagazineTransformerImpl implements MagazineTransformer {
	
	 @Override
	public MagazineDTO toMagazineDTO(Magazine magazine, boolean isParent, String classParentName) {
		// TODO Auto-generated method stub
		 MagazineDTO magazineDTO = new MagazineDTO();
		 magazineDTO.setId(magazine.getId());
		 magazineDTO.setItemRef(magazine.getItemRef());
		 magazineDTO.setName(magazine.getName());
		 magazineDTO.setAlley(magazine.getAlley());
		 magazineDTO.setEditionNumber(magazine.getEditionNumber());
		 magazineDTO.setPlace(magazine.getPlace());
		 magazineDTO.setPublishDate(magazine.getPublishDate());
		 magazineDTO.setRemainingCount(magazine.getRemainingCount());
		 magazineDTO.setTotalCount(magazine.getTotalCount());
		 if(magazine.getBorrows()!=null && isParent)
		 {
			 BorrowTransformer borrowTransformer = new BorrowTransformerImpl();
			 magazineDTO.setBorrows(borrowTransformer.toBorrowsDTO(magazine.getBorrows(), false, magazineDTO.getClass().getName()));
		 }
		 if(magazine.getImage()!=null)
		 {
			 ImageTransformer imageTransformer = new ImageTransformerImpl();
			 magazineDTO.setImage(imageTransformer.toImageDTO(magazine.getImage(), false, magazineDTO.getClass().getName()));
		 }
		return magazineDTO;
	}
	 
	 @Override
	public Set<MagazineDTO> toMagazinesDTO(Set<Magazine> magazines, boolean isParent, String classParentName) {
		Set<MagazineDTO> magazinesDTO = new HashSet<>();
		for(Magazine magazine : magazines)
		{
			magazinesDTO.add(toMagazineDTO(magazine, isParent, classParentName));
		}
		return magazinesDTO;
	}

}
