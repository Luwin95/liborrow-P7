package com.liborrow.webservice.business.impl.manager;

import org.liborrow.webservice.model.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liborrow.webservice.business.contract.manager.BookManager;
import com.liborrow.webservice.consumer.repository.BookRepository;

@Service
public class BookManagerImpl implements BookManager {
	@Autowired
	BookRepository bookRepository;
	
	public Book findBookById(Integer id)
	{
		return bookRepository.findOne(id);
	}
}
