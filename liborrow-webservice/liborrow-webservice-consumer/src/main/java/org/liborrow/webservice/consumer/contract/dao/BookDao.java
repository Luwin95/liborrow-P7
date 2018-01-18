package org.liborrow.webservice.consumer.contract.dao;

import java.util.List;
import java.util.Set;

import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface BookDao {
	void add(Book book);
	Set<Book> listBooks();
	Set<BookDTO> searchBook(ItemCriterias itemCriterias);
}
