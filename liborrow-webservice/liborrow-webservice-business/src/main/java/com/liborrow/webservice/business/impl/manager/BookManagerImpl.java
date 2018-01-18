package com.liborrow.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.Citizenship;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.BookManager;
import com.liborrow.webservice.consumer.repository.BookRepository;

@Service
public class BookManagerImpl extends AbstractManagerImpl implements BookManager {
	@Autowired
	BookRepository bookRepository;
	
	@Override
	@Transactional
	public BookDTO findBookById(long id)
	{
		Book book = bookRepository.findOne(id);
		bookEntityHibernateInitialization(book);
		BookDTO bookDTO = getTransformerFactory().getBookTransformer().toBookDTO(book, true);
		return bookDTO;
	}
	
	@Override
	@Transactional
	public List<BookDTO> findAllBooks()
	{
		List<Book> books = bookRepository.findAll();
		List<BookDTO> booksDTO = new ArrayList<>();
		for(Book book : books)
		{
			bookEntityHibernateInitialization(book);
			BookDTO bookDTO = getTransformerFactory().getBookTransformer().toBookDTO(book, true);
			booksDTO.add(bookDTO);
		}
		return booksDTO;
	}
	
	@Override
	public List<BookDTO> searchBook(ItemCriterias itemCriterias) {
		List<BookDTO> books = new ArrayList<>();
		books.addAll(getDaoFactory().getBookDao().searchBook(itemCriterias));
		return books;
	}
	
	@Override
	public void bookEntityHibernateInitialization(Book book)
	{
		Hibernate.initialize(book.getAuthors());
		for(Author author : book.getAuthors())
		{
			Hibernate.initialize(author.getBooks());
			Hibernate.initialize(author.getCitizenships());
			for(Citizenship citizenship : author.getCitizenships())
			{
				Hibernate.initialize(citizenship.getAuthors());
			}
		}
		Hibernate.initialize(book.getBorrows());
		for(Borrow borrow : book.getBorrows())
		{
			Hibernate.initialize(borrow.getBorrower());
			Hibernate.initialize(borrow.getItems());
		}
	}
}
