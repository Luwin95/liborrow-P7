package com.liborrow.webinterface.business.impl.manager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import com.liborrow.webinterface.business.contract.manager.BorrowManager;
import com.liborrow.webinterface.generated.model.BookDTO;
import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.ItemDTO;
import com.liborrow.webinterface.generated.model.MagazineDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;
import com.liborrow.webinterface.generated.model.WaitingListDTO;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

public class BorrowManagerImpl extends AbstractManagerImpl implements BorrowManager {

	public BorrowDTO getBorrowById(long id) {
		return getDaoFactory().getBorrowDao().getBorrowById(id);
	}
	
	public List<BorrowDTO> getAllCurrentBorrows() {
		List<BorrowDTO> borrows = getDaoFactory().getBorrowDao().getAllBorrows();
		List<BorrowDTO> borrowsToDelete = new ArrayList<BorrowDTO>();
		for(BorrowDTO borrow : borrows)
		{
			GregorianCalendar gregorianCalendar = new GregorianCalendar();
	        Date endDate = borrow.getEndDate().toGregorianCalendar().getTime();
	        Date now= new Date();
			if(endDate.before(now))
			{
				borrowsToDelete.add(borrow);
			}
		}
		borrows.removeAll(borrowsToDelete);
		
		return borrows;
	}
	
	public List<BorrowDTO> getAllOnGoingBorrowByUserLogged(UserLightDTO user) {
		return getDaoFactory().getBorrowDao().getAllOnGoingBorrowByUserLogged(user);
	}
	
	public boolean markBorrow(BorrowDTO borrow) {
		if(borrow.isExtended())
		{
			return false;
		}else {
			getDaoFactory().getBorrowDao().markBorrow(borrow);
			return true;
		}
	}
	
	public List<WaitingListDTO> getUserReservations(UserLightDTO user) {
		return getDaoFactory().getBorrowDao().getUserReservations(user);
	}
	
	public Calendar getNextGetBackDate(Long itemId) {
		return getDaoFactory().getBorrowDao().getNextGetbackDate(itemId);
	}
	
	
	public List<String> getNextGetbackDatesReservations(List<WaitingListDTO> reservations){
		List<String> getBackDates = new ArrayList<String>();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		for(WaitingListDTO reservation : reservations) {
			if(null!=reservation.getBookDTO()) {
				getBackDates.add(df.format(getNextGetBackDate(reservation.getBookDTO().getId()).getTime()));
			}else {
				getBackDates.add(df.format(getNextGetBackDate(reservation.getMagazineDTO().getId()).getTime()));
			}
		}
		return getBackDates;
	}
}
