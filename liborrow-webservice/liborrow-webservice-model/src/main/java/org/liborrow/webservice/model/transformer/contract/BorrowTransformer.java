package org.liborrow.webservice.model.transformer.contract;

import java.util.Set;

import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.entities.Borrow;

public interface BorrowTransformer {
	
	BorrowDTO toBorrowDTO(Borrow borrow, boolean isParent, String classParentName);
	Set<BorrowDTO> toBorrowsDTO(Set<Borrow> borrows, boolean isParent, String classParentName);
	Borrow toBorrowEntity(BorrowDTO borrow, boolean isParent, String classParentName);
	Set<Borrow> toBorrowsEntities(Set<BorrowDTO> borrows, boolean isParent, String classParentName);
}
