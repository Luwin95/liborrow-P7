package com.liborrow.callagainbatch.consumer.impl.dao;

import java.util.List;

import com.liborrow.callagainbatch.consumer.contract.dao.BorrowDao;
import com.liborrow.callagainbatch.consumer.impl.AbstractDaoImpl;
import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.WaitingListDTO;

public class BorrowDaoImpl extends AbstractDaoImpl implements BorrowDao {
	public List<BorrowDTO> findLateBorrows() {
		return getBorrowSrv().findLateBorrows();
	}
	
	public List<WaitingListDTO> getWaitingListAvailable() {
		return getBorrowSrv().getWaitingListAvailable();
	}
	
	public List<WaitingListDTO> getWaitingListByItem(Long itemId) {
		return getBorrowSrv().getWaitingListByItem(itemId);
	}
	
	public List<WaitingListDTO> getWaitingListByNotificationDateObsolete() {
		return getBorrowSrv().getWaitingListByNotificationDateObsolete();
	}
	
	public void removeReservations(List<Long> reservations) {
		getBorrowSrv().removeReservations(reservations);
	}
	
	public void saveReservations(List<WaitingListDTO> reservations) {
		getBorrowSrv().saveReservations(reservations);
	}
	
	public List<BorrowDTO> remindBorrows() {
		return getBorrowSrv().remindBorrows();
	}
	
	public void saveBorrow(BorrowDTO borrow) {
		getBorrowSrv().updateBorrow(borrow);
	}
}
