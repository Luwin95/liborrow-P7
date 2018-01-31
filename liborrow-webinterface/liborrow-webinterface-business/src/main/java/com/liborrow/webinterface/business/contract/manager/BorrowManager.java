package com.liborrow.webinterface.business.contract.manager;

import java.util.List;
import java.util.Map;

import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public interface BorrowManager {

	BorrowDTO getBorrowById(long id);
	List<BorrowDTO> getAllCurrentBorrows();
	List<BorrowDTO> getAllOnGoingBorrowByUserLogged(UserLightDTO user);
	boolean markBorrow(BorrowDTO borrow);
	BorrowDTO initializeBorrow(Map<String, Object> mapItems);
	void saveNewBorrow(BorrowDTO borrow);
}
