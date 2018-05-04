package com.liborrow.webinterface.webapp.actions;

import com.liborrow.webinterface.generated.model.BookDTO;
import com.liborrow.webinterface.generated.model.MagazineDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class ItemManagementAction  extends AbstractAction {

	// ==================== Attributs ====================
    // ----- Paramètres en entrée
	private String idBook; 
	private String idMagazine; 
	
	// ----- Eléments en sortie
	private BookDTO book;
	private MagazineDTO magazine;
	
	// ==================== Getters/Setters ====================
	public BookDTO getBook() {
		return book;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}
	
	public String getIdMagazine() {
		return idMagazine;
	}

	public void setIdMagazine(String idMagazine) {
		this.idMagazine = idMagazine;
	}

	public MagazineDTO getMagazine() {
		return magazine;
	}
	
	// ==================== Méthodes ====================
	/**
	 * Affiche le livre d'id sélectionné
	 * 
	 * @return success
	 */
	public String displayBook() {
		 book = getManagerFactory().getBookManager().getBookById(Integer.parseInt(idBook));
	     return SUCCESS;
	}
	
	/**
	 * Affiche le magazine d'id sélectionné
	 * 
	 * @return
	 */
	public String displayMagazine() {
		magazine = getManagerFactory().getMagazineManager().getMagazineById(Integer.parseInt(idMagazine));
        return SUCCESS;
	}
}
