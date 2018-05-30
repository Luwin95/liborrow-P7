package com.liborrow.callagainbatch.business.impl.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.liborrow.callagainbatch.business.contract.manager.ReservationManager;
import com.liborrow.callagainbatch.business.impl.AbstractManagerImpl;
import com.liborrow.webinterface.generated.model.WaitingListDTO;
import com.liborrow.webinterface.utils.enums.MailTypeEnum;

public class ReservationManagerImpl extends AbstractManagerImpl implements ReservationManager {

	public List<WaitingListDTO> getWaitingListByNotificationDateObsolete() {
		return getDaoFactory().getBorrowDao().getWaitingListByNotificationDateObsolete();
	}
	
	public void removeWaitingListObsolete(List<Long> reservations) {
		getDaoFactory().getBorrowDao().removeReservations(reservations);
	}
	
	private List<Long> getAllItemIdsFromReservations(List<WaitingListDTO> reservations) {
		List<Long> itemModifiedList = new ArrayList<Long>();
		for(WaitingListDTO reservation : reservations) {
			itemModifiedList.add(reservation.getItem().getId());
		}
		return itemModifiedList;
	}
	
	public void reorganizePositionInWaitingList(Map<Long,Long> itemIds) {
		Set keys = itemIds.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			Long itemId = (Long) it.next();
			Long position = (Long) itemIds.get(itemId);
			List <WaitingListDTO> reservations = getDaoFactory().getBorrowDao().getWaitingListByItem(itemId);
			for(WaitingListDTO reservation : reservations) {
				if(reservation.getPosition()>position)
				reservation.setPosition(reservation.getPosition()-1);
			}
			getDaoFactory().getBorrowDao().saveReservations(reservations);
		}
	}
	
	public List<WaitingListDTO> getWaitingListAvailable() {
		return getDaoFactory().getBorrowDao().getWaitingListAvailable();
	}
}
