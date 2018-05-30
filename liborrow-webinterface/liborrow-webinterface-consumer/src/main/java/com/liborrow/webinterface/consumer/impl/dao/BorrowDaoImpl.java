package com.liborrow.webinterface.consumer.impl.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.liborrow.webinterface.consumer.contract.dao.BorrowDao;
import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;
import com.liborrow.webinterface.generated.model.WaitingListDTO;

public class BorrowDaoImpl extends AbstractDao implements BorrowDao  {
	
	public BorrowDTO getBorrowById(long id) {
		return getBorrowSrv().getBorrow(id);
	}
	
	public List<BorrowDTO> getAllBorrows() {
		return getBorrowSrv().getAllBorrows();
	}
	
	public List<BorrowDTO> getAllOnGoingBorrowByUserLogged(UserLightDTO user) {
		return getBorrowSrv().getUserBorrows(user);
	}
	
	public void markBorrow(BorrowDTO borrow)
	{
		getBorrowSrv().markBorrowAsExtended(borrow);
	}
	
	public List<WaitingListDTO> getUserReservations(UserLightDTO user){
		return getBorrowSrv().findUserWaitingList(user);
	}
	
	public Calendar getNextGetbackDate(Long itemId) {
		return getBorrowSrv().getNextGetBackDate(itemId).toGregorianCalendar();
	}
}
