package com.liborrow.webservice.business.contract.manager;

import java.util.List;

import org.liborrow.webservice.model.entities.Book;

public interface BookManager {
	Book findBookById(long id);
	List<Book> findAllBooks();
	void bookEntityHibernateInitialization(Book book);
}
