package org.liborrow.webservice.consumer.impl.dao;

import javax.persistence.Query;

import org.liborrow.webservice.consumer.contract.dao.WaitingListDao;

public class WaitingListDaoImpl extends AbstractDaoImpl implements WaitingListDao {
	@Override
	public Integer getWaitingListSize(Long itemId) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT count(waitingList.id) FROM WaitingList waitingList JOIN waitingList.item WHERE waitingList.item.id=:item ");
		Query query = getEm().createQuery(queryString.toString());
		query.setParameter("item", itemId);
		return (Integer) query.getSingleResult();
	}
	
	@Override
	public Integer getLastPosition(Long itemId) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT max(waitingList.position) FROM WaitingList JOIN FETCH waitingList.item item WHERE waitingList.item.id=:item ");
		Query query = getEm().createQuery(queryString.toString());
		query.setParameter("item", itemId);
		return (Integer) query.getSingleResult();
	}
}
