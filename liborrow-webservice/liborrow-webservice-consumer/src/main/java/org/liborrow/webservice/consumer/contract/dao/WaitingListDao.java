package org.liborrow.webservice.consumer.contract.dao;

import java.util.Calendar;
import java.util.List;

import org.liborrow.webservice.model.entities.Item;
import org.liborrow.webservice.model.entities.WaitingList;

public interface WaitingListDao {
	
	Long getWaitingListSize(Long itemId);
	Integer getLastPosition(Long itemId);
	boolean checkItemInUserWaitingList(Long itemId,Long userId);
	List<WaitingList> getWaitingListByBorrower(Long userId);
	void removeItemInUserWaitingList(Long itemId, Long userId);
	List<WaitingList> getWaitingListByNotificationDateObsolete();
	List<WaitingList> getWaitingListByItem(Long itemId);
	List<WaitingList> getWaitingListAvailable();
}
