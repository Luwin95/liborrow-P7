package com.liborrow.webinterface.business.contract.manager;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;
import com.liborrow.webinterface.generated.model.WaitingListDTO;

public interface BorrowManager {

	BorrowDTO getBorrowById(long id);
	List<BorrowDTO> getAllCurrentBorrows();
	List<BorrowDTO> getAllOnGoingBorrowByUserLogged(UserLightDTO user);
	boolean markBorrow(BorrowDTO borrow);
	List<WaitingListDTO> getUserReservations(UserLightDTO user);
	Calendar getNextGetBackDate(Long itemId);
	List<String> getNextGetbackDatesReservations(List<WaitingListDTO> reservations);
}
