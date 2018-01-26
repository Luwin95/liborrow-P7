package com.liborrow.webinterface.webapp.actions;

import java.util.List;

import com.liborrow.webinterface.generated.model.AuthorDTO;
import com.liborrow.webinterface.generated.model.BookDTO;
import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.MagazineDTO;
import com.liborrow.webinterface.generated.model.SearchResponse;
import com.liborrow.webinterface.webapp.AbstractAction;

public class SearchAuthorAction extends AbstractAction{
	private boolean reponse;
	private ItemCriterias itemCriterias = new ItemCriterias();
	private List<BookDTO> bookResponse;
	private List<AuthorDTO> authorResponse;
	private List<MagazineDTO> magazineResponse;
	
	public String execute() throws Exception {
		itemCriterias.setStringSearch(false);
		itemCriterias.setBookSearch(false);
		itemCriterias.setMagazineSearch(false);
		SearchResponse searchResponse =getManagerFactory().getItemManager().searchItem(itemCriterias);
		setBookResponse(searchResponse.getBooks());
		setAuthorResponse(searchResponse.getAuthors());
		setMagazineResponse(searchResponse.getMagazines());
		setReponse(true);
    	return SUCCESS;
	}
	
	public boolean isReponse() {
		return reponse;
	}
	public void setReponse(boolean reponse) {
		this.reponse = reponse;
	}
	public ItemCriterias getItemCriterias() {
		return itemCriterias;
	}
	public void setItemCriterias(ItemCriterias itemCriterias) {
		this.itemCriterias = itemCriterias;
	}
	public List<BookDTO> getBookResponse() {
		return bookResponse;
	}
	public void setBookResponse(List<BookDTO> bookResponse) {
		this.bookResponse = bookResponse;
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
	
	
}
