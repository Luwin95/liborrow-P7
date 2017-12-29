package com.liborrow.webservice.consumer.repository;

import java.util.List;

import org.liborrow.webservice.model.entities.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends ItemBaseRepository<Book> {
	@Override
    List<Book> findAll();
	
	/*@Query("SELECT b FROM Book b JOIN FETCH b.authors WHERE b.item_id = (:item_id)")
    public Book findByIdAndFetchAuthorsEagerly(@Param("item_id") Long id);*/
}
