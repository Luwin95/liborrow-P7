package com.liborrow.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

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
		BookDTO bookDTO = new BookDTO();
		bookDTO = getTransformerFactory().getBookTransformer().toBookDTO(book, true, bookDTO.getClass().getName());
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
			BookDTO bookDTO = new BookDTO();
			bookDTO = getTransformerFactory().getBookTransformer().toBookDTO(book, true, bookDTO.getClass().getName());
			booksDTO.add(bookDTO);
		}
		return booksDTO;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<BookDTO> searchBook(ItemCriterias itemCriterias) {
		Set<Book> booksEntities = getDaoFactory().getBookDao().searchBook(itemCriterias);
		List<BookDTO> books = new ArrayList<>();
		if(books!=null && booksEntities.size()!=0)
		{
			books.addAll(getTransformerFactory().getBookTransformer().toBooksDTO(booksEntities,true, "org.liborrow.webservice.model.dto.BookDTO"));
		}
		return books;
	}
	
	@Override
	public void bookEntityHibernateInitialization(Book book)
	{
		Hibernate.initialize(book.getAuthors());
		Hibernate.initialize(book.getImage());
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
			Hibernate.initialize(borrow.getItem());
		}
	}
	
	@Override
	@Transactional
	public void createBook(BookDTO book) {
		Book bookEntity = getTransformerFactory().getBookTransformer().toBookEntity(book, true, Book.class.getSimpleName());
		bookRepository.save(bookEntity);
	}
	
	@Override
	@Transactional
	public void updateBook(BookDTO book) {
		Book bookEntity = getTransformerFactory().getBookTransformer().toBookEntity(book, true, Book.class.getSimpleName());
		bookRepository.save(bookEntity);
	}
	
	@Override
	@Transactional
	public void deleteBook(BookDTO book) {
		Book bookEntity = getTransformerFactory().getBookTransformer().toBookEntity(book, true, Book.class.getSimpleName());
		bookRepository.delete(bookEntity);
	}
	
	@Override
	public void bookListEntityHibernateInitialization(Collection<Book> books) {
		for(Book book : books)
		{
			bookEntityHibernateInitialization(book);
		}
	}
}
