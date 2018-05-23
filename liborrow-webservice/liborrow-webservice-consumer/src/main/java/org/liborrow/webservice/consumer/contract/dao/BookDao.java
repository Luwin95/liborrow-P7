package org.liborrow.webservice.consumer.contract.dao;

import java.util.Set;

import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface BookDao {
	/**
	 * Insère un livre en base de données
	 * 
	 * @param book
	 * 		Le livre à insérer
	 */
	void add(Book book);
	
	/**
	 * Récupère la liste de tous les livres
	 * 
	 * @return Set de livres
	 * 		La liste de tous les livres en base
	 */
	Set<Book> listBooks();
	
	/**
	 * Exécute une recherche de livre en fonction des différents critères en paramètre
	 * 
	 * @param itemCriterias
	 * 		Les critères de recherche
	 * @return Set de livres
	 * 		La liste des livres retournés par la recherche
	 */
	Set<Book> searchBook(ItemCriterias itemCriterias);
	
	/**
	 * Exécute une recherche de livre en fonction d'une simple chaîne de caractère
	 * 
	 * @param itemCriterias
	 * 		Les critères de recherche
	 * @param simpleStringSplited
	 * 		La chaîne de caractère éclatée
	 * @return Set de livres
	 * 		La liste des livres retournés par la recherche
	 */
	Set<Book> searchWithSimpleStringBook(ItemCriterias itemCriterias, String[] simpleStringSplited);
}
