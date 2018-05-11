package org.liborrow.webservice.consumer.contract.dao;

public interface WaitingListDao {
	
	Long getWaitingListSize(Long itemId);
	Integer getLastPosition(Long itemId);
}
