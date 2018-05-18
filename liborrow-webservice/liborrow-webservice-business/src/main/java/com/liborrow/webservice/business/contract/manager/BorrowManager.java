package com.liborrow.webservice.business.contract.manager;

import java.util.List;

import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.dto.UserDTO;
import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.dto.WaitingListDTO;

public interface BorrowManager {
	BorrowDTO findBorrowById(long id);
	List<BorrowDTO> findOnGoingBorrowsByUser(UserLightDTO user);
	List<BorrowDTO> findAllBorrows();
	boolean markAsExtended(BorrowDTO borrow);
	void newBorrow(BorrowDTO borrow);
	void updateBorrow(BorrowDTO borrow);
	void deleteBorrow(BorrowDTO borrow);
	List<BorrowDTO> findLateBorrows();
	List<WaitingListDTO> findUserWaitingList(UserLightDTO user);
}
