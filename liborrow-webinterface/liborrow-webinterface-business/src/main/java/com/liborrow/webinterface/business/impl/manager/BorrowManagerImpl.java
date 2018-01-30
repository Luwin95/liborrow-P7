package com.liborrow.webinterface.business.impl.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import com.liborrow.webinterface.business.contract.manager.BorrowManager;
import com.liborrow.webinterface.generated.model.BookDTO;
import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;

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
		// TODO Auto-generated method stub
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
	
	public BorrowDTO initializeBorrow(Map<String, Object> mapItems) {
		BorrowDTO borrow = new BorrowDTO();
		if(mapItems.containsKey("book"))
		{
			borrow.setBookDTO((BookDTO) mapItems.get("book"));
		}
		return null;
	}
}
