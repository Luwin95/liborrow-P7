package com.liborrow.webservice.business.contract.manager;

import java.util.List;

import org.liborrow.webservice.model.dto.CitizenshipDTO;
import org.liborrow.webservice.model.dto.UserDTO;
import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.entities.UserAccount;
import org.liborrow.webservice.model.entities.UserLight;
import org.liborrow.webservice.model.utilsobject.UserCriterias;

public interface UserManager {
	boolean isInDatabase(String email);
	boolean validateCredentials(UserAccount userAccount, String plainPassword);
	UserLightDTO login(String email, String plainPassword);
	void userEntityHibernateInitialization(UserAccount user);
	void userEntityHibernateInitialization(UserLight user);
	List<UserLightDTO> searchUser(UserCriterias userCriterias);
	UserLightDTO findById(long idUser);
	void createUser(UserDTO user);
	void updateUser(UserLightDTO user);
	void deleteUser(UserDTO user);
	List<String> getAllCitizenshipsName();
	void saveNewUser(UserDTO user);
	CitizenshipDTO getCitizenshipByCountry(String country);
}
