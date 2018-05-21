package com.liborrow.callagainbatch.business.impl.manager;

import java.util.ArrayList;
import java.util.List;

import com.liborrow.callagainbatch.business.contract.manager.ReservationManager;
import com.liborrow.callagainbatch.business.impl.AbstractManagerImpl;
import com.liborrow.webinterface.generated.model.WaitingListDTO;

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
	
	public void reorganizePositionInWaitingList(List<Long> itemIds) {
		for(Long itemId : itemIds) {
			List <WaitingListDTO> reservations = getDaoFactory().getBorrowDao().getWaitingListByItem(itemId);
			for(WaitingListDTO reservation : reservations) {
				reservation.setPosition(reservation.getPosition()-1);
			}
			getDaoFactory().getBorrowDao().saveReservations(reservations);
		}
	}
	
	public List<WaitingListDTO> getWaitingListAvailable() {
		return getDaoFactory().getBorrowDao().getWaitingListAvailable();
	}
}
