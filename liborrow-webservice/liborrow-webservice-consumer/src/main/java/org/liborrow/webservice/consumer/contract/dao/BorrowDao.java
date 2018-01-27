package org.liborrow.webservice.consumer.contract.dao;

import org.liborrow.webservice.model.entities.Borrow;

public interface BorrowDao {
	
	void markAsExtended(Borrow borrow);

}
