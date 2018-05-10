package org.liborrow.webservice.consumer.contract.dao;

public interface WaitingListDao {
	
	Integer getWaitingListSize(Long itemId);
	Integer getLastPosition(Long itemId);
}
