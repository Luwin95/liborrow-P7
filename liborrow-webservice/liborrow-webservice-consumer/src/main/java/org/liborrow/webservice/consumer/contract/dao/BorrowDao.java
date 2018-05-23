package org.liborrow.webservice.consumer.contract.dao;

import java.util.Calendar;
import java.util.List;

import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.entities.Borrow;

public interface BorrowDao {
	
	/**
	 * Marque un prêt comme prolongé
	 * 
	 * @param borrow
	 * 		Le prêt à prolonger
	 */
	void markAsExtended(Borrow borrow);
	
	/**
	 * Récupère la liste des prêts en retard
	 * 
	 * @return Liste de prêt
	 * 		La liste des prêts en retard
	 */
	List<Borrow> findLateGetBackBorrows();
	
	/**
	 * Retourne vrai si le prêt existe pour l'item et l'utilisateur en paramètre, faux sinon
	 * 
	 * @param itemId
	 * 		L'id de l'item
	 * @param userId
	 * 		L'id de l'utilisateur
	 * @return boolean
	 * 		Le résultat du test true/false
	 */
	Boolean checkItemForUser(Long itemId,Long userId);
	
	/**
	 * Retourne la date de retour de prêt la plus proche pour un item (#ISSUE 1)
	 * 
	 * @param itemId
	 * 		L'id de l'item
	 * @return Calendar
	 * 		La date de retour de prêt la plus proche pour l'item
	 */
	Calendar getNextGetBackDate(Long itemId);
	
	/**
	 * Retourne laliste des prêts qui doivent être rappelés aux utilisateurs 
	 * ayant sélectionné l'option de rappel(#ISSUE 3).
	 * 
	 * @return Liste de prêts
	 * 		La liste des prêts devant être rappelés
	 */
	List<Borrow> remindBorrows();

}
