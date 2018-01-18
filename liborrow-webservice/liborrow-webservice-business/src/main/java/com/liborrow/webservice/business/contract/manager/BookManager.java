package com.liborrow.webservice.business.contract.manager;

import java.util.List;

import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface BookManager {
	BookDTO findBookById(long id);
	List<BookDTO> findAllBooks();
	void bookEntityHibernateInitialization(Book book);
	List<BookDTO> searchBook(ItemCriterias itemCriterias);
}
