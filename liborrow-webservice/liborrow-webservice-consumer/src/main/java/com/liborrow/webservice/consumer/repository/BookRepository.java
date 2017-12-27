package com.liborrow.webservice.consumer.repository;

import java.util.List;

import org.liborrow.webservice.model.entities.Book;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BookRepository extends ItemBaseRepository<Book> {
	@Override
    List<Book> findAll();
}
