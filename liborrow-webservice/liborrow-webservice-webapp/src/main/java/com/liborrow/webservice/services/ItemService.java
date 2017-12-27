package com.liborrow.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Item;
import org.liborrow.webservice.model.entities.Magazine;

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
	
	@WebMethod
	public Magazine getMagazine(Integer id)
	{
		return getManagerFactory().getMagazineManager().findMagazineById(id);
	}
	
	@WebMethod
	public List<Magazine> getAllMagazines()
	{
		return getManagerFactory().getMagazineManager().findAllMagazines();
	}
	
	@WebMethod
	public List<Item> searchItem()
	{
		return null;
	}
}
