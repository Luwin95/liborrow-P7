package com.liborrow.webinterface.webapp.actions;

import java.util.ArrayList;
import java.util.List;

import com.liborrow.webinterface.generated.model.itemservice.AuthorCriterias;
import com.liborrow.webinterface.generated.model.itemservice.Book;
import com.liborrow.webinterface.generated.model.itemservice.BookCriterias;
import com.liborrow.webinterface.generated.model.itemservice.ItemCriterias;
import com.liborrow.webinterface.generated.model.itemservice.MagazineCriterias;
import com.liborrow.webinterface.generated.model.itemservice.SearchResponse;
import com.liborrow.webinterface.webapp.AbstractAction;

public class SearchItemAction extends AbstractAction{
	private String search;
	private List<Book> bookResponse = new ArrayList<Book>();
	
	public String execute() throws Exception {
		ItemCriterias itemCriterias = new ItemCriterias();
		itemCriterias.setAuthorCriterias(new AuthorCriterias());
		itemCriterias.setBookCriterias(new BookCriterias());
		itemCriterias.setMagazineCriterias(new MagazineCriterias());
		itemCriterias.getBookCriterias().setTitle(search);
		itemCriterias.getBookCriterias().setEditor(search);
		itemCriterias.getAuthorCriterias().setFirstname(search);
		itemCriterias.getAuthorCriterias().setLastname(search);
		itemCriterias.getMagazineCriterias().setName(search);
		SearchResponse searchResponse =getManagerFactory().getItemManager().searchItem(itemCriterias);
		setBookResponse(searchResponse.getBooks());
    	return SUCCESS;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public List<Book> getBookResponse() {
		return bookResponse;
	}

	public void setBookResponse(List<Book> bookResponse) {
		this.bookResponse = bookResponse;
	}
	
	
	
	
}
