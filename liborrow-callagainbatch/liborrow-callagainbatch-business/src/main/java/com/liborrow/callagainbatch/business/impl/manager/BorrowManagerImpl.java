package com.liborrow.callagainbatch.business.impl.manager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeFactory;

import com.liborrow.callagainbatch.business.contract.manager.BorrowManager;
import com.liborrow.callagainbatch.business.impl.AbstractManagerImpl;
import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public class BorrowManagerImpl extends AbstractManagerImpl implements BorrowManager   {
	public List<BorrowDTO> findLateBorrows() {
		return getDaoFactory().getBorrowDao().findLateBorrows();
	}
	
	public List<BorrowDTO> remindBorrows(){
		return getDaoFactory().getBorrowDao().remindBorrows();
	}
	
	public Map<String, List<String>> createChunkContextMap (List<BorrowDTO> borrows) {
		Map<String, List<String>> emailAndBorrows = new HashMap<String, List<String>>();
		UserLightDTO userTemp = new UserLightDTO();
		List<UserLightDTO> usersToContact = new ArrayList<UserLightDTO>();
		
		for(BorrowDTO borrow: borrows)
		{
			if(emailAndBorrows.containsKey(borrow.getBorrower().getEmail()))
			{
				List<String> borrowToSave = (List<String>) emailAndBorrows.get(borrow.getBorrower().getEmail());
				if(null!= borrow.getBookDTO() && borrow.getBookDTO().getId()!=0)
				{
					borrowToSave.add(borrow.getBookDTO().getTitle());
				}else{
					borrowToSave.add(borrow.getMagazineDTO().getName()+" n° "+borrow.getMagazineDTO().getEditionNumber());
				}
				emailAndBorrows.put(borrow.getBorrower().getEmail(), borrowToSave);
			}else {
				List<String> borrowToSave = new ArrayList<String>();
				if(null!= borrow.getBookDTO() && borrow.getBookDTO().getId()!=0)
				{
					borrowToSave.add(borrow.getBookDTO().getTitle());
				}else {
					borrowToSave.add(borrow.getMagazineDTO().getName()+" n° "+borrow.getMagazineDTO().getEditionNumber());
				}
				emailAndBorrows.put(borrow.getBorrower().getEmail(), borrowToSave);
			}
		}
		return emailAndBorrows;
	}
	
	public void saveBorrowsRecallDate(List<BorrowDTO> borrows) {
		for(BorrowDTO borrow : borrows) {
			try {
				GregorianCalendar cal = new GregorianCalendar();
				cal.setTime(new Date());
				borrow.setRecallDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
				getDaoFactory().getBorrowDao().saveBorrow(borrow);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
