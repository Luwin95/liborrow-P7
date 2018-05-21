package com.liborrow.callagainbatch.business.contract.manager;

import java.util.List;
import java.util.Map;

import com.liborrow.webinterface.generated.model.WaitingListDTO;

public interface ReservationManager {
	List<WaitingListDTO> getWaitingListByNotificationDateObsolete();
	void removeWaitingListObsolete(List<Long> reservations);
	void reorganizePositionInWaitingList(Map<Long,Long> itemIds);
	List<WaitingListDTO> getWaitingListAvailable();
}
