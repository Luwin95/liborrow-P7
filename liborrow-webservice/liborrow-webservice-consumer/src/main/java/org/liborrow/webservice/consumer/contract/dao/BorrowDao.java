package org.liborrow.webservice.consumer.contract.dao;

import java.util.List;

import org.liborrow.webservice.model.entities.Borrow;

public interface BorrowDao {
	
	void markAsExtended(Borrow borrow);
	List<Borrow> findLateGetBackBorrows();

}
