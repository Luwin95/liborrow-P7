package com.liborrow.webservice.consumer.repository;

import java.util.List;

import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface BorrowRepository extends CrudRepository<Borrow, Long> {
	@Override
	List<Borrow> findAll();
	
	List<Borrow> findByBorrower(User borrower);
}
