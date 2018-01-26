package com.liborrow.webinterface.business.contract.manager;

import java.util.List;

import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public interface BorrowManager {
	List<BorrowDTO> getAllCurrentBorrows();
	
	List<BorrowDTO> getAllOnGoingBorrowByUserLogged(UserLightDTO user);
}
