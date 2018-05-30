package com.liborrow.webservice.business.contract.manager;

import java.util.Collection;
import java.util.List;

import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface BookManager {
	BookDTO findBookById(long id);
	List<BookDTO> findAllBooks();
	void bookEntityHibernateInitialization(Book book);
	void bookListEntityHibernateInitialization(Collection<Book> books);
	List<BookDTO> searchBook(ItemCriterias itemCriterias);
	void createBook(BookDTO book);
	void updateBook(BookDTO book);
	void deleteBook(BookDTO book);
}
