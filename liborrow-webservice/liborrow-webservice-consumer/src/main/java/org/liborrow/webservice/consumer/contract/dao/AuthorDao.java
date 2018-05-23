package org.liborrow.webservice.consumer.contract.dao;

import java.util.Set;

import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface AuthorDao {
	/**
	 * Exécute une recherche d'auteurs en fonction des critères données en paramètres
	 * 
	 * @param itemCriterias
	 * @return Set d'auteurs
	 */
	Set<Author> searchAuthor(ItemCriterias itemCriterias);
	
	/**
	 * Exécute une recherche d'auteur en fonction d'une simple chaîne de caractère
	 * 
	 * @param itemCriterias 
	 * 		Critères de recherche qui s'applique
	 * @param simpleStringSplited 
	 * 		tableau de chaine de caractère contenant la chaîne de caractère de recherche éclaté.
	 * @return Set d'auteurs
	 */
	Set<Author> searchWithSimpleStringAuthor(ItemCriterias itemCriterias, String[] simpleStringSplited);
}
