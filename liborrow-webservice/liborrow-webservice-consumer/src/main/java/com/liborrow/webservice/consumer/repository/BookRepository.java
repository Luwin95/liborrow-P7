package com.liborrow.webservice.consumer.repository;

import org.liborrow.webservice.model.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
