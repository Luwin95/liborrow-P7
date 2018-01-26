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
//		 if(magazine.getBorrows()!=null && isParent)
//		 {
//			 BorrowTransformer borrowTransformer = new BorrowTransformerImpl();
//			 magazineDTO.setBorrows(borrowTransformer.toBorrowsDTO(magazine.getBorrows(), false, magazineDTO.getClass().getName()));
//		 }
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
	 
	@Override
	public Magazine toMagazineEntity(MagazineDTO magazine, boolean isParent, String classParentName) {
		// TODO Auto-generated method stub
		 Magazine magazineTransformed = new Magazine();
		 magazineTransformed.setId(magazine.getId());
		 magazineTransformed.setItemRef(magazine.getItemRef());
		 magazineTransformed.setName(magazine.getName());
		 magazineTransformed.setAlley(magazine.getAlley());
		 magazineTransformed.setEditionNumber(magazine.getEditionNumber());
		 magazineTransformed.setPlace(magazine.getPlace());
		 magazineTransformed.setPublishDate(magazine.getPublishDate());
		 magazineTransformed.setRemainingCount(magazine.getRemainingCount());
		 magazineTransformed.setTotalCount(magazine.getTotalCount());
		 if(magazine.getBorrows()!=null && isParent)
		 {
			 BorrowTransformer borrowTransformer = new BorrowTransformerImpl();
			 magazineTransformed.setBorrows(borrowTransformer.toBorrowsEntities(magazine.getBorrows(), false, magazineTransformed.getClass().getSimpleName()));
		 }
		 if(magazine.getImage()!=null)
		 {
			 ImageTransformer imageTransformer = new ImageTransformerImpl();
			 magazineTransformed.setImage(imageTransformer.toImageEntity(magazine.getImage(), false, magazineTransformed.getClass().getSimpleName()));
		 }
		return magazineTransformed;
	}
	
	@Override
	public Set<Magazine> toMagazinesEntities(Set<MagazineDTO> magazines, boolean isParent, String classParentName) {
		Set<Magazine> magazinesTransformed = new HashSet<>();
		for(MagazineDTO magazine : magazines)
		{
			magazinesTransformed.add(toMagazineEntity(magazine, isParent, classParentName));
		}
		return magazinesTransformed;
	}

}
