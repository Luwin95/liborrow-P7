package com.liborrow.callagainbatch.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.WaitingListDTO;

import java.util.List;



public interface BorrowDao {
	List<BorrowDTO> findLateBorrows();
	List<WaitingListDTO> getWaitingListByNotificationDateObsolete();
	List<WaitingListDTO> getWaitingListByItem(Long itemId);
	List<WaitingListDTO> getWaitingListAvailable();
	void removeReservations(List<WaitingListDTO> reservations);
	void saveReservations(List<WaitingListDTO> reservations);
}
