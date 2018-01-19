package org.liborrow.webservice.consumer.contract.dao;

import java.util.Set;

import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface BookDao {
	void add(Book book);
	Set<Book> listBooks();
	Set<Book> searchBook(ItemCriterias itemCriterias);
	Set<Book> searchWithSimpleStringBook(ItemCriterias itemCriterias, String[] simpleStringSplited);
}
