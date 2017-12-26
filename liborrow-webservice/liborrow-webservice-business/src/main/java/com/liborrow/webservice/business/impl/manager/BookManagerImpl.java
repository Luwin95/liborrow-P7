package com.liborrow.webservice.business.impl.manager;

import java.util.List;

import org.liborrow.webservice.model.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liborrow.webservice.business.contract.manager.BookManager;
import com.liborrow.webservice.consumer.repository.BookRepository;

@Service
public class BookManagerImpl implements BookManager {
	@Autowired
	BookRepository bookRepository;
	
	@Override
	public Book findBookById(long id)
	{
		return bookRepository.findOne(id);
	}
	
	@Override
	public List<Book> findAllBooks()
	{
		return bookRepository.findAll();
	}
}
