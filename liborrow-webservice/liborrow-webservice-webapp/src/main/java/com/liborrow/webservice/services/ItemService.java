package com.liborrow.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Item;
import org.liborrow.webservice.model.entities.Magazine;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.liborrow.webservice.model.utilsobject.SearchResponse;

import com.liborrow.webservice.AbstractService;

@WebService(name = "ItemClient", serviceName = "ItemService", portName = "ItemPort", targetNamespace="itemservice.model.generated.webinterface.liborrow.com")

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
	public SearchResponse searchItem(ItemCriterias itemCriterias)
	{
		SearchResponse searchResponse = new SearchResponse();
		searchResponse.setBooks(getManagerFactory().getBookManager().searchBook(itemCriterias));
		return searchResponse;
	}
}
