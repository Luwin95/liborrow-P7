package org.liborrow.webservice.consumer.contract.dao;

import java.util.List;

import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface BookDao {
	void add(Book book);
	List<Book> listBooks();
	List<Book> searchBook(ItemCriterias itemCriterias);
}
