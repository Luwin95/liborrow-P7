package com.liborrow.webservice.business.contract.manager;

import java.util.List;

import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.dto.UserLightDTO;

public interface BorrowManager {
	BorrowDTO findBorrowById(long id);
	List<BorrowDTO> findOnGoingBorrowsByUser(UserLightDTO user);
	List<BorrowDTO> findAllBorrows();
	boolean markAsExtended(BorrowDTO borrow);
	void newBorrow(BorrowDTO borrow);
	List<BorrowDTO> findLateBorrows();
}
