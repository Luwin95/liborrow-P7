package com.liborrow.callagainbatch.business.contract.manager;

import java.util.List;

import com.liborrow.webinterface.generated.model.WaitingListDTO;

public interface ReservationManager {
	List<WaitingListDTO> getWaitingListByNotificationDateObsolete();
	void removeWaitingListObsolete(List<Long> reservations);
	void reorganizePositionInWaitingList(List<Long> itemIds);
	List<WaitingListDTO> getWaitingListAvailable();
}
