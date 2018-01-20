package com.liborrow.webservice.business.contract.manager;

import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.entities.UserAccount;
import org.liborrow.webservice.model.entities.UserLight;

public interface UserManager {
	boolean isInDatabase(String email);
	boolean validateCredentials(UserAccount userAccount, String plainPassword);
	UserLightDTO login(String email, String plainPassword);
	void userEntityHibernateInitialization(UserAccount user);
	void userEntityHibernateInitialization(UserLight user);
}
