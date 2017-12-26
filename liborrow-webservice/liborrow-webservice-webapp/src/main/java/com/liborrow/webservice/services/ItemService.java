package com.liborrow.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.liborrow.webservice.model.entities.Book;
import com.liborrow.webservice.AbstractService;

@WebService(serviceName="itemService")
public class ItemService extends AbstractService{
	
	@WebMethod
	public Book getBook(Integer id)
	{
		return getManagerFactory().getBookManager().findBookById(id);
	}
	
	@WebMethod
	public List<Book> getAllBooks()
	{
		return getManagerFactory().getBookManager().findAllBooks();
	}
}
