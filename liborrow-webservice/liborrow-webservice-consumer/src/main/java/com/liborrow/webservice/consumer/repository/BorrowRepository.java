package com.liborrow.webservice.consumer.repository;

import java.util.Date;
import java.util.List;

import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.UserLight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BorrowRepository extends CrudRepository<Borrow, Long> {
	@Override
	List<Borrow> findAll();
	
	List<Borrow> findByBorrower(UserLight borrower);
	
	List<Borrow> findByGetBackDate(Date getBackDate);
	
	@Query("SELECT b FROM Borrow b join fetch b.item WHERE b.borrower = (:borrower) AND b.getBackDate=null")
	List<Borrow> searchOnGoingBorrowByUserAccount(@Param("borrower") UserLight borrower);
	
	@Query("SELECT b FROM Borrow b join fetch b.item WHERE b.id=(:id)")
	Borrow getBorrowById(@Param("id")long id);
}
