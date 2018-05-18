package com.liborrow.webinterface.webapp.actions;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;
import com.liborrow.webinterface.generated.model.WaitingListDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class BorrowsManagementAction extends AbstractAction implements SessionAware{
	
	// ==================== Attributs ====================
    // ----- Paramètres en entrée
	private GregorianCalendar now = new GregorianCalendar();
	protected Map<String,Object> session;
	private String idBorrow;
	private String error;
	
	// ----- Eléments en sortie
	private BorrowDTO borrow;
	private List<BorrowDTO> borrows;
	private List<WaitingListDTO> reservations;
	
	// ==================== Getters/Setters ====================
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<BorrowDTO> getBorrows() {
		return borrows;
	}

	public GregorianCalendar getNow() {
		return now;
	}
	
	public BorrowDTO getBorrow() {
		return borrow;
	}
	public void setBorrow(BorrowDTO borrow) {
		this.borrow = borrow;
	}

	public String getIdBorrow() {
		return idBorrow;
	}

	public void setIdBorrow(String idBorrow) {
		this.idBorrow = idBorrow;
	}
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	public List<WaitingListDTO> getReservations() {
		return reservations;
	}

	// ==================== Méthodes ====================
	/**
	 * Récupère la liste des prêts en cours de l'utilisateur loggé
	 * 
	 * @return success
	 */
	public String doListOnGoingBorrows() {
		borrows = getManagerFactory().getBorrowManager().getAllOnGoingBorrowByUserLogged((UserLightDTO) session.get("sessionUser"));
        return "success";
	}
	
	/**
	 * Met à jour le champ extended du prêt sélectionné par l'utilisateur
	 * 
	 * @return success
	 */
	public String extendBorrow() {
		UserLightDTO currentUser = (UserLightDTO) session.get("sessionUser");
		borrow = getManagerFactory().getBorrowManager().getBorrowById(Integer.parseInt(idBorrow));
		if(borrow.getBorrower().getId() == currentUser.getId()) {
			boolean isUpdated = getManagerFactory().getBorrowManager().markBorrow(borrow);
			if(isUpdated)
			{
				return "success";
			}else {
				return "error";
			}
		}else {
			return "error";
		}
	}
	
	/**
	 * Récupère la liste des réservations de l'utilisateur loggé
	 * 
	 * @return success
	 */
	public String doListReservations() {
		reservations = getManagerFactory().getBorrowManager().getUserReservations((UserLightDTO) session.get("sessionUser"));
		return SUCCESS;
	}
}
