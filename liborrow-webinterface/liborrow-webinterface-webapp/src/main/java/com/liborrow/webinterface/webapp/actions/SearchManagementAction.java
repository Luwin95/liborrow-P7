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
	private String error;
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
	public String getError() {
		return error;
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
	 * @return success/input
	 */
	public String searchItem() {
		if(checkSimplSearchStringForm()) {
			itemCriterias.setSimpleStringSearch(search);
			itemCriterias.setStringSearch(true);
			SearchResponse searchResponse =getManagerFactory().getItemManager().searchItem(itemCriterias);
			setBookResponse(searchResponse.getBooks());
			setAuthorResponse(searchResponse.getAuthors());
			setMagazineResponse(searchResponse.getMagazines());
			setReponse(true);
			return SUCCESS;
		}else {
			return INPUT;
		}
	}

	/**
	 * Action de recherche d'un livre
	 * 
	 * @return success/input
	 */
	public String searchBook() {
		if(checkBookSearchForm(itemCriterias.getBookCriterias().getTitle(), itemCriterias.getBookCriterias().getEditor(), itemCriterias.getItemRef())) {
			itemCriterias.setStringSearch(false);
			itemCriterias.setAuthorSearch(false);
			itemCriterias.setMagazineSearch(false);
			SearchResponse searchResponse =getManagerFactory().getItemManager().searchBook(itemCriterias);
			setBookResponse(searchResponse.getBooks());
			setAuthorResponse(searchResponse.getAuthors());
			setMagazineResponse(searchResponse.getMagazines());
			setReponse(true);
			return SUCCESS;
		}else {
			return INPUT;
		}
	}
	
	/**
	 * Action de recherche d'un auteur
	 * 
	 * @return success/input
	 */
	public String searchAuthor() {
		if(checkAuthorSearchForm(itemCriterias.getAuthorCriterias().getFirstname(), itemCriterias.getAuthorCriterias().getLastname())) {
			itemCriterias.setStringSearch(false);
			itemCriterias.setBookSearch(false);
			itemCriterias.setMagazineSearch(false);
			SearchResponse searchResponse =getManagerFactory().getItemManager().searchAuthor(itemCriterias);
			setBookResponse(searchResponse.getBooks());
			setAuthorResponse(searchResponse.getAuthors());
			setMagazineResponse(searchResponse.getMagazines());
			setReponse(true);
	    	return SUCCESS;
		}else {
			return INPUT;
		}
	}
	
	/**
	 * Action de recherche d'un magazine
	 * 
	 * @return success/input
	 */
	public String searchMagazine() {
		if(checkMagazineSearchForm(itemCriterias.getMagazineCriterias().getName(), itemCriterias.getMagazineCriterias().getEditionNumber(), itemCriterias.getItemRef())) {
			itemCriterias.setStringSearch(false);
			itemCriterias.setAuthorSearch(false);
			itemCriterias.setBookSearch(false);
			SearchResponse searchResponse =getManagerFactory().getItemManager().searchMagazine(itemCriterias);
			setBookResponse(searchResponse.getBooks());
			setAuthorResponse(searchResponse.getAuthors());
			setMagazineResponse(searchResponse.getMagazines());
			setReponse(true);
			return SUCCESS;
		}else {
			return INPUT;
		}
	}
	
	/**
	 * Vérifie l'intégrité des champs entrés dans le formulaire
	 * 
	 * @return boolean result (résultat de la vérification des champs)
	 */
	private boolean checkSimplSearchStringForm() {
		if(null!=search && search.length()>=5 && search.length()<=30) {
			return true;
		}else {
			this.addFieldError("search", "La recherche doit faire au moins 5 caractères et au plus 30 caractères.");
			return false;
		}
	}
	
	/**
	 * Vérifie l'intégrité des champs entrés dans le formulaire de recherche par auteur
	 * 
	 * @param String firstname
	 * @param String lastname
	 * @return boolean result (résultat de la vérification des champs)
	 */
	private boolean checkAuthorSearchForm(String firstname, String lastname) {
		if(null!=firstname && !firstname.equals("") && null!=lastname && !lastname.equals("")) {
			return true;
		}else {
			this.error = "Le nom et le prénom de l'auteur doivent être renseignés";
			return false;
		}
	}
	
	/**
	 * Vérifie l'intégrité des champs entrés dans le formulaire de recherche par livre
	 * 
	 * @param String title
	 * @param String editor
	 * @param String reference
	 * @return boolean result (résultat de la vérification des champs)
	 */
	private boolean checkBookSearchForm(String title, String editor, String reference) {
		if((null!=title && !title.equals(""))||(null!=editor && !editor.equals(""))||(null!=reference && !reference.equals(""))) {
			return true;
		}else {
			this.error = "Au moins un des trois champs de recherche de livre doit être rentré";
			return false;
		}
	}
	
	/**
	 * Vérifie l'intégrité des champs entrés dans le formulaire de recherche par magazine
	 * 
	 * @param name
	 * @param editionNumber
	 * @param reference
	 * @return boolean result (résultat de la vérification des champs)
	 */
	private boolean checkMagazineSearchForm(String name, int editionNumber, String reference) {
		if((null!=name && !name.equals(""))||(0!=editionNumber)||(null!=reference && !reference.equals(""))) {
			return true;
		}else {
			this.error = "Au moins un des trois champs de recherche de magazine doit être rentré";
			return false;
		}
	}
}
