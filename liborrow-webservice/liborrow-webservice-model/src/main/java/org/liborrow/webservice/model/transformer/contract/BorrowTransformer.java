package org.liborrow.webservice.model.transformer.contract;

import java.util.Set;

import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.entities.Borrow;

public interface BorrowTransformer {
	

	BorrowDTO toBorrowDTO(Borrow borrow, boolean isParent);
	Set<BorrowDTO> toBorrowsDTO(Set<Borrow> borrows, boolean isParent);
}
