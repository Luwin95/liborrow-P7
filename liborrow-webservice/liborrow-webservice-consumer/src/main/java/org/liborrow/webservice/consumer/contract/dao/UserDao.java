package org.liborrow.webservice.consumer.contract.dao;

import java.util.List;
import java.util.Set;

import org.liborrow.webservice.model.entities.Citizenship;
import org.liborrow.webservice.model.entities.UserLight;
import org.liborrow.webservice.model.utilsobject.UserCriterias;

public interface UserDao {
	/**
	 * Permet de rechercher un utilisateur en fonction de critères de recherche
	 * 
	 * @param userCriterias
	 * 		Les critères de recherche
	 * @return Set d'utilisateur léger
	 * 		Le résultat de la recherche
	 */
	Set<UserLight> searchUser(UserCriterias userCriterias);
	
	/**
	 * Récupère la liste de tous les noms de pays
	 * 
	 * @return List de chaîne de caractère
	 * 		La liste de tous les noms de pays
	 */
	List<String> getAllCitizenshipNames();
	
	/**
	 * Récupère une nationalité en fonction du nom de pays
	 * 
	 * @param country
	 * 		Le nom de pays
	 * @return Citizenship
	 * 		La nationalité
	 */
	Citizenship getCitizenshipDTO(String country);
}
