package com.liborrow.webservice.business.contract.manager;

import java.util.List;

import org.liborrow.webservice.model.dto.BorrowDTO;

public interface BorrowManager {
	BorrowDTO findBorrowById(long id);
	List<BorrowDTO> findBorrowByUser(long userId);
	List<BorrowDTO> findAllBorrows();
}
