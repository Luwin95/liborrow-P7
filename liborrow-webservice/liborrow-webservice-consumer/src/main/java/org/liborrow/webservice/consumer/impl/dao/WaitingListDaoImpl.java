package org.liborrow.webservice.consumer.impl.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.liborrow.webservice.consumer.contract.dao.WaitingListDao;
import org.liborrow.webservice.model.entities.Item;
import org.liborrow.webservice.model.entities.WaitingList;

public class WaitingListDaoImpl extends AbstractDaoImpl implements WaitingListDao {
	@Override
	public Long getWaitingListSize(Long itemId) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT count(waitingList.id) FROM WaitingList waitingList JOIN waitingList.item WHERE waitingList.item.id=:item ");
		Query query = getEm().createQuery(queryString.toString());
		query.setParameter("item", itemId);
		return (Long) query.getSingleResult();
	}
	
	@Override
	public Integer getLastPosition(Long itemId) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT max(waitingList.position) FROM WaitingList waitingList JOIN waitingList.item item WHERE waitingList.item.id=:item ");
		Query query = getEm().createQuery(queryString.toString());
		query.setParameter("item", itemId);
		Integer lastPosition = (Integer) query.getSingleResult();
		return lastPosition != null ? lastPosition : 0;
	}
	
	@Override
	public boolean checkItemInUserWaitingList(Long itemId, Long userId) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT waitingList FROM WaitingList waitingList JOIN waitingList.item item JOIN waitingList.borrower borrower WHERE waitingList.item.id=:item and waitingList.borrower.id =:user ");
		Query query = getEm().createQuery(queryString.toString());
		query.setParameter("item", itemId);
		query.setParameter("user", userId);
		List<WaitingList> listWaitingList = (List<WaitingList>) query.getResultList();
		return listWaitingList.size()>0 ? true : false;
	}
	
	@Override
	public List<WaitingList> getWaitingListByBorrower(Long userId){
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT waitingList FROM WaitingList waitingList LEFT JOIN FETCH waitingList.item item LEFT JOIN FETCH waitingList.borrower borrower WHERE waitingList.borrower.id=:user ");
		Query query = getEm().createQuery(queryString.toString());
		query.setParameter("user", userId);
		List<WaitingList> listWaitingList = (List<WaitingList>) query.getResultList();
		return listWaitingList;
	}
	
	@Override
	public void removeItemInUserWaitingList(Long itemId, Long userId) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT waitingList FROM WaitingList waitingList WHERE waitingList.item.id=:item and waitingList.borrower.id =:user ");
		Query query = getEm().createQuery(queryString.toString());
		query.setParameter("item", itemId);
		query.setParameter("user", userId);
		WaitingList waitingList = (WaitingList) query.getSingleResult();
		getEm().remove(waitingList);
	}
	
	
	@Override
	public List<WaitingList> getWaitingListByNotificationDateObsolete() {
		StringBuilder queryString = new StringBuilder();
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.HOUR, -48);
		queryString.append("SELECT waitingList FROM WaitingList waitingList LEFT JOIN FETCH waitingList.item item LEFT JOIN FETCH waitingList.borrower borrower WHERE waitingList.notificationDate IS NOT NULL AND waitingList.notificationDate<=:now ");
		Query query = getEm().createQuery(queryString.toString());
		query.setParameter("now", cal);
		return query.getResultList();
	}

	@Override
	public List<WaitingList> getWaitingListByItem(Long itemId){
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT waitingList FROM WaitingList waitingList LEFT JOIN FETCH waitingList.item item LEFT JOIN FETCH waitingList.borrower borrower WHERE waitingList.item.id=:item");
		Query query = getEm().createQuery(queryString.toString());
		query.setParameter("item", itemId);
		return query.getResultList();
	}
	
	@Override
	public List<WaitingList> getWaitingListAvailable() {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT waitingList FROM WaitingList waitingList LEFT JOIN FETCH waitingList.item item LEFT JOIN FETCH waitingList.borrower borrower WHERE waitingList.item.totalCount>0 AND waitingList.position=1 AND waitingList.notificationDate IS NULL");
		Query query = getEm().createQuery(queryString.toString());
		return query.getResultList();
	}
}
