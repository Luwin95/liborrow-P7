package org.liborrow.webservice.consumer.contract.dao;

import java.util.Calendar;
import java.util.List;

import org.liborrow.webservice.model.entities.Item;
import org.liborrow.webservice.model.entities.WaitingList;

public interface WaitingListDao {
	
	/**
	 * Récupère la taille de la liste d'attente pour un item donné
	 * 
	 * @param itemId
	 * 		Id de l'item 
	 * @return Long
	 * 		Taille de la liste d'attente pour l'item en paramètre
	 */
	Long getWaitingListSize(Long itemId);
	
	/**
	 * Récupère la position maximale dans la liste d'attente pour un item donné
	 * 
	 * @param itemId
	 * 		Id de l'item
	 * @return Integer
	 * 		Position maximale 
	 */
	Integer getLastPosition(Long itemId);
	
	/**
	 * Retourne true si l'item donné existe dans la liste d'attente pour l'utilisateur donné
	 * 
	 * @param itemId
	 * 		Id de l'item
	 * @param userId
	 * 		Id de l'utilisateur
	 * @return true/false
	 * 		Résultat du test
	 */
	boolean checkItemInUserWaitingList(Long itemId,Long userId);
	
	/**
	 * Permet de retrouver toutes les réservations d'un utilisateur
	 * @param userId
	 * 		Id de l'utilisateur
	 * @return List de réservation
	 * 		La liste des résrvations de l'utilisateur
	 */
	List<WaitingList> getWaitingListByBorrower(Long userId);
	
	/**
	 * Supprime une réservation pour un utilisateur et un item donné
	 * @param itemId
	 * 		Id de l'item
	 * @param userId
	 * 		Id de l'utilisateur
	 */
	void removeItemInUserWaitingList(Long itemId, Long userId);
	
	/**
	 * Récupère les réservations dont la date de notification est obsolète (Plus de 48h)
	 * 
	 * @return List de réservations
	 * 		La liste des réservations dont la date de ntification est obsolète
	 */
	List<WaitingList> getWaitingListByNotificationDateObsolete();
	
	/**
	 * Récupère la liste des réservations pour un item donné
	 * 
	 * @param itemId
	 * 		Id de l'item
	 * @return List de réservations
	 * 		La liste des réservtions de l'item en paramètre
	 */
	List<WaitingList> getWaitingListByItem(Long itemId);
	
	/**
	 * Récupère la liste des réservations de première position dont l'item est disponible
	 * 
	 * @return List de réservations
	 * 		La liste de réservations dont l'item est disponible
	 */
	List<WaitingList> getWaitingListAvailable();
	
	/**
	 * Récupère la réservation correspondant à un tem et un utilisateur
	 * 
	 * @param itemId
	 * 		Id de l'item
	 * @param userId
	 * 		Id de l'utilisateur
	 * @return Reservation
	 * 		La réservation correspondant à l'item et l'utilisateur en paramètre
	 */
	WaitingList getWaitingListByBorrowerAndItem(Long itemId, Long userId);
	
	/**
	 * Récupère la réservation en fnction de son ID
	 * 
	 * @param id
	 * 		Id de la réservation
	 * @return
	 * 		Reservation
	 */
	WaitingList getWaitingListById(Long id);
}
