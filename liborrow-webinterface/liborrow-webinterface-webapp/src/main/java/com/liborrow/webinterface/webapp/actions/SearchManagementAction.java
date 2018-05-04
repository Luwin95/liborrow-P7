package com.liborrow.webinterface.webapp.actions;

import java.util.List;

import com.liborrow.webinterface.generated.model.AuthorDTO;
import com.liborrow.webinterface.generated.model.BookDTO;
import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.MagazineDTO;
import com.liborrow.webinterface.generated.model.SearchResponse;
import com.liborrow.webinterface.webapp.AbstractAction;

/**
 * 
 * @author Luwin95
 *
 *Action de gestion des recherches
 */
public class SearchManagementAction  extends AbstractAction{
	
	// ==================== Attributs ====================
    // ----- Paramètres en entrée
	private ItemCriterias itemCriterias= new ItemCriterias();;
	private String search;
	
	
	// ----- Eléments en sortie
	private boolean reponse;
	private List<BookDTO> bookResponse;
	private List<AuthorDTO> authorResponse;
	private List<MagazineDTO> magazineResponse;
	
	
	
	// ==================== Getters/Setters ====================
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
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	
	
	// ==================== Méthodes ====================
	/**
	 * Affiche la page d'accueil de recherche
	 * 
	 * @return success
	 */
	public String searchHome() {
		System.out.println("Hello world");
		return SUCCESS;
	}
	
	/**
	 * Action de recherche d'un item (livre, auteur ou magazine)
	 * 
	 * @return success
	 */
	public String searchItem() {
		itemCriterias.setSimpleStringSearch(search);
		itemCriterias.setStringSearch(true);
		SearchResponse searchResponse =getManagerFactory().getItemManager().searchItem(itemCriterias);
		setBookResponse(searchResponse.getBooks());
		setAuthorResponse(searchResponse.getAuthors());
		setMagazineResponse(searchResponse.getMagazines());
		setReponse(true);
		return SUCCESS;
	}

	/**
	 * Action de recherche d'un livre
	 * 
	 * @return
	 */
	public String searchBook() {
		itemCriterias.setStringSearch(false);
		itemCriterias.setAuthorSearch(false);
		itemCriterias.setMagazineSearch(false);
		SearchResponse searchResponse =getManagerFactory().getItemManager().searchBook(itemCriterias);
		setBookResponse(searchResponse.getBooks());
		setAuthorResponse(searchResponse.getAuthors());
		setMagazineResponse(searchResponse.getMagazines());
		setReponse(true);
		return SUCCESS;
	}
	
	/**
	 * Action de recherche d'un auteur
	 * 
	 * @return success
	 */
	public String searchAuthor() {
		itemCriterias.setStringSearch(false);
		itemCriterias.setBookSearch(false);
		itemCriterias.setMagazineSearch(false);
		SearchResponse searchResponse =getManagerFactory().getItemManager().searchAuthor(itemCriterias);
		setBookResponse(searchResponse.getBooks());
		setAuthorResponse(searchResponse.getAuthors());
		setMagazineResponse(searchResponse.getMagazines());
		setReponse(true);
    	return SUCCESS;
	}
	
	/**
	 * Action de recherche d'un magazine
	 * 
	 * @return success
	 */
	public String searchMagazine() {
		itemCriterias.setStringSearch(false);
		itemCriterias.setAuthorSearch(false);
		itemCriterias.setBookSearch(false);
		SearchResponse searchResponse =getManagerFactory().getItemManager().searchMagazine(itemCriterias);
		setBookResponse(searchResponse.getBooks());
		setAuthorResponse(searchResponse.getAuthors());
		setMagazineResponse(searchResponse.getMagazines());
		setReponse(true);
		return SUCCESS;
	}
}
