package com.liborrow.webservice.consumer.repository;

import java.util.Set;

import org.liborrow.webservice.model.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

	Set<Author> findTop5ByOrderByIdDesc();
}
