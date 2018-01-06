package com.liborrow.webservice.business.impl.manager;

import java.util.List;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.Citizenship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.BookManager;
import com.liborrow.webservice.consumer.repository.BookRepository;

@Service
public class BookManagerImpl implements BookManager {
	@Autowired
	BookRepository bookRepository;
	
	@Override
	@Transactional
	public Book findBookById(long id)
	{
		Book book = bookRepository.findOne(id);
		bookEntityHibernateInitialization(book);
		return book;
	}
	
	@Override
	@Transactional
	public List<Book> findAllBooks()
	{
		List<Book> books = bookRepository.findAll();
		for(Book book : books)
		{
			bookEntityHibernateInitialization(book);
		}
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
