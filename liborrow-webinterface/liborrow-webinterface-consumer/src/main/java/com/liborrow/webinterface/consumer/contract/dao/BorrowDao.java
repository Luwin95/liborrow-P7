package com.liborrow.webinterface.consumer.contract.dao;

import java.util.List;

import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public interface BorrowDao {
	List<BorrowDTO> getAllBorrows();
	List<BorrowDTO> getAllOnGoingBorrowByUserLogged(UserLightDTO user);

}
