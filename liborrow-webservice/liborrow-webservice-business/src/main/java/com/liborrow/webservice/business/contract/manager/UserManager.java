package com.liborrow.webservice.business.contract.manager;

import java.util.List;

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
}
