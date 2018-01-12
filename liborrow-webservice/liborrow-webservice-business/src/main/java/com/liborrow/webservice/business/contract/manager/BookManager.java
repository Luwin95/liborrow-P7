package com.liborrow.webservice.business.contract.manager;

import java.util.List;

import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface BookManager {
	Book findBookById(long id);
	List<Book> findAllBooks();
	void bookEntityHibernateInitialization(Book book);
	List<Book> searchBook(ItemCriterias itemCriterias);
}
