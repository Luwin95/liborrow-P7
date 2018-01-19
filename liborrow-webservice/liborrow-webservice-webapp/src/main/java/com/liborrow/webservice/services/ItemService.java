package com.liborrow.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.dto.MagazineDTO;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.liborrow.webservice.model.utilsobject.SearchResponse;

import com.liborrow.webservice.AbstractService;

@WebService(name = "ItemClient", serviceName = "ItemService", portName = "ItemPort", targetNamespace="itemservice.model.generated.webinterface.liborrow.com")

public class ItemService extends AbstractService{
	
	@WebMethod
	public BookDTO getBook(Integer id)
	{
		return getManagerFactory().getBookManager().findBookById(id);
	}
	
	@WebMethod
	public List<BookDTO> getAllBooks()
	{
		return getManagerFactory().getBookManager().findAllBooks();
	}
	
	@WebMethod
	public MagazineDTO getMagazine(Integer id)
	{
		return getManagerFactory().getMagazineManager().findMagazineById(id);
	}
	
	@WebMethod
	public List<MagazineDTO> getAllMagazines()
	{
		return getManagerFactory().getMagazineManager().findAllMagazines();
	}
	
	@WebMethod
	public SearchResponse searchItem(ItemCriterias itemCriterias)
	{
		SearchResponse searchResponse = new SearchResponse();
		if(itemCriterias.isStringSearch())
		{
			String[] splitedString = itemCriterias.getSimpleStringSearch().split("\\s+");
			searchResponse = getManagerFactory().getItemManager().searchWithSimpleString(itemCriterias, splitedString);
		}else {
			if(itemCriterias.getBookCriterias()!=null)
			{
				searchResponse.setBooks(getManagerFactory().getBookManager().searchBook(itemCriterias));
			}
			
			if(itemCriterias.getAuthorCriterias() !=null)
			{
				searchResponse.setAuthors(getManagerFactory().getAuthorManager().searchAuthor(itemCriterias));
			}
			
			if(itemCriterias.getMagazineCriterias() != null)
			{
				searchResponse.setMagazines(getManagerFactory().getMagazineManager().searchMagazine(itemCriterias));
			}
		}
		return searchResponse;
	}
}
