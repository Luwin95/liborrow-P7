package com.liborrow.webinterface.consumer.impl.dao;

import java.util.List;

import com.liborrow.webinterface.consumer.contract.dao.BorrowDao;
import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public class BorrowDaoImpl extends AbstractDao implements BorrowDao  {

	public List<BorrowDTO> getAllBorrows() {
		return getBorrowSrv().getAllBorrows();
	}
	
	public List<BorrowDTO> getAllOnGoingBorrowByUserLogged(UserLightDTO user) {
		return getBorrowSrv().getUserBorrows(user);
	}
}
