package org.liborrow.webservice.consumer.impl.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Query;

import org.liborrow.webservice.consumer.contract.dao.BorrowDao;
import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.entities.Borrow;
import org.springframework.beans.factory.annotation.Autowired;

import com.liborrow.webservice.consumer.repository.BorrowRepository;

public class BorrowDaoImpl extends AbstractDaoImpl implements BorrowDao {

	@Autowired
	BorrowRepository borrowRepository;
	
	@Override
	public void markAsExtended(Borrow borrow) {
		borrow.setExtended(true);
		getEm().merge(borrow);
		getEm().flush();
	}
	
	@Override
	public List<Borrow> findLateGetBackBorrows() {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT borrow FROM Borrow borrow JOIN FETCH borrow.item WHERE ((borrow.startDate<=:now AND borrow.extended=false)OR(borrow.startDate<=:now2 AND borrow.extended=true)) AND getBackDate=null");
		Query query = getEm().createQuery(queryString.toString());
		Calendar cal1Month = Calendar.getInstance();
		cal1Month.setTime(new Date());
		cal1Month.add(Calendar.MONTH, -1);
		query.setParameter("now", cal1Month.getTime());
		Calendar cal2Month = Calendar.getInstance();
		cal2Month.setTime(new Date());
		cal2Month.add(Calendar.MONTH, -2);
		query.setParameter("now2", cal2Month.getTime());
		return (List<Borrow>) query.getResultList();
	}
	
	/**
	 * Retourne true si l'utilisateur a bien emprunté l'item et false sinon
	 * 
	 * return boolean
	 */
	@Override
	public Boolean checkItemForUser(Long itemId, Long userId) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT borrow FROM Borrow borrow JOIN FETCH borrow.item item JOIN FETCH borrow.borrower WHERE ((borrow.item.id=:item AND borrow.borrower.id=:borrower");
		Query query = getEm().createQuery(queryString.toString());
		query.setParameter("item", itemId);
		query.setParameter("borrower", userId);
		return query.getSingleResult()!=null;
	}
}
