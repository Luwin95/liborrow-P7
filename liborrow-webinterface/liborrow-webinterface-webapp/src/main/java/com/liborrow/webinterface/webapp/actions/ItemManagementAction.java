package com.liborrow.webinterface.webapp.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.liborrow.webinterface.generated.model.BookDTO;
import com.liborrow.webinterface.generated.model.ItemDTO;
import com.liborrow.webinterface.generated.model.MagazineDTO;
import com.liborrow.webinterface.generated.model.ReservationResponse;
import com.liborrow.webinterface.generated.model.UserLightDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class ItemManagementAction  extends AbstractAction implements SessionAware {

	// ==================== Attributs ====================
    // ----- Paramètres en entrée
	private String idBook; 
	private String idMagazine; 
	private Long itemId;
	private Map<String, Object> session;
	
	// ----- Eléments en sortie
	private BookDTO book;
	private MagazineDTO magazine;
	private ItemDTO item;
	private ReservationResponse reservationResponse;
	
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
	
	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public ReservationResponse getReservationResponse() {
		return reservationResponse;
	}

	public void setReservationResponse(ReservationResponse reservationResponse) {
		this.reservationResponse = reservationResponse;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
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
	 * @return success
	 */
	public String displayMagazine() {
		magazine = getManagerFactory().getMagazineManager().getMagazineById(Integer.parseInt(idMagazine));
        return SUCCESS;
	}
	
	/**
	 * Réservation d'un item et ajout à la liste d'attente
	 * 
	 * @return success/error
	 */
	public String reserveItem() {
		item = getManagerFactory().getItemManager().getItem(itemId);
		if(null!=item) {
			reservationResponse = getManagerFactory().getItemManager().reserveItem(item, (UserLightDTO) session.get("sessionUser"));
			return SUCCESS;
		}else {
			return "error";
		}
	}
	
	/**
	 * Annule la réservation sélectionnée
	 * 
	 * @return success/error
	 */
	public String cancelReservation() {
		if(0!=itemId) {
			reservationResponse = getManagerFactory().getItemManager().cancelItemReservation(itemId,(UserLightDTO) session.get("sessionUser"));
			return SUCCESS;
		}else{
			return "error";
		}
	}
}
