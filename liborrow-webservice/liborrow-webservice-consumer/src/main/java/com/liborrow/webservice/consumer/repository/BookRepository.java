package com.liborrow.webservice.consumer.repository;

import java.util.List;
import java.util.Set;

import org.liborrow.webservice.model.entities.Book;

public interface BookRepository extends ItemBaseRepository<Book> {
	@Override
    List<Book> findAll();
	
	Set<Book> findTop5ByOrderByIdDesc();
	
	/*@Query("SELECT b FROM Book b JOIN FETCH b.authors WHERE b.item_id = (:item_id)")
    public Book findByIdAndFetchAuthorsEagerly(@Param("item_id") Long id);*/
}
