package com.liborrow.webinterface.webapp.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.liborrow.webinterface.generated.model.AuthorDTO;
import com.liborrow.webinterface.generated.model.BookDTO;
import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.MagazineDTO;
import com.liborrow.webinterface.generated.model.SearchResponse;
import com.liborrow.webinterface.webapp.AbstractAction;

public class SearchItemAction extends AbstractAction implements SessionAware{
	private String search;
	private boolean reponse;
	private ItemCriterias itemCriterias = new ItemCriterias();
	private List<BookDTO> bookResponse;
	private List<AuthorDTO> authorResponse;
	private List<MagazineDTO> magazineResponse;
	private Map<String, Object> session;
	
	public String execute() throws Exception {
		itemCriterias.setSimpleStringSearch(search);
		itemCriterias.setStringSearch(true);
		SearchResponse searchResponse =getManagerFactory().getItemManager().searchItem(itemCriterias);
		setBookResponse(searchResponse.getBooks());
		setAuthorResponse(searchResponse.getAuthors());
		setMagazineResponse(searchResponse.getMagazines());
		setReponse(true);
    	return SUCCESS;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public List<BookDTO> getBookResponse() {
		return bookResponse;
	}

	public void setBookResponse(List<BookDTO> bookResponse) {
		this.bookResponse = bookResponse;
	}

	public ItemCriterias getItemCriterias() {
		return itemCriterias;
	}

	public void setItemCriterias(ItemCriterias itemCriterias) {
		this.itemCriterias = itemCriterias;
	}

	public List<AuthorDTO> getAuthorResponse() {
		return authorResponse;
	}

	public void setAuthorResponse(List<AuthorDTO> authorResponse) {
		this.authorResponse = authorResponse;
	}

	public List<MagazineDTO> getMagazineResponse() {
		return magazineResponse;
	}

	public void setMagazineResponse(List<MagazineDTO> magazineResponse) {
		this.magazineResponse = magazineResponse;
	}

	public boolean isReponse() {
		return reponse;
	}

	public void setReponse(boolean reponse) {
		this.reponse = reponse;
	}
	
	public void setSession(Map<String, Object> session) {
        this.session = session;
    }
	
}
