package com.liborrow.webservice.business.contract.manager;

import java.util.List;

import org.liborrow.webservice.model.entities.Borrow;

public interface BorrowManager {
	Borrow findBorrowById(long id);
	List<Borrow> findBorrowByUser(long userId);
	List<Borrow> findAllBorrows();
}
