package org.liborrow.webservice.consumer.contract.dao;

import java.util.Set;

import org.liborrow.webservice.model.entities.Magazine;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface MagazineDao {
	/**
	 * Recherche des magazines en fonction de critères de recherche en paramètres
	 * 
	 * @param itemCriterias
	 * 		Les critères de recherche
	 * @return Set de magazines
	 * 		Le résultat de la recherche
	 */
	Set<Magazine> searchMagazine(ItemCriterias itemCriterias);
	
	/**
	 * Recherche des magazines en fonction d'une simple chaîne de caractère
	 * 
	 * @param itemCriterias
	 * 		Les critères de recherche
	 * @param simpleStringSplited
	 * 		La chaîne de caractère de recherche éclatée
	 * @return Set de magazines
	 * 		Le résultat de la recherche
	 */
	Set<Magazine> searchWithSimpleStringMagazine(ItemCriterias itemCriterias, String[] simpleStringSplited);
}
