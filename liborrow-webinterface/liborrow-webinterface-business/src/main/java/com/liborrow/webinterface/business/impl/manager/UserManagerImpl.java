package com.liborrow.webinterface.business.impl.manager;

import com.liborrow.webinterface.business.contract.manager.UserManager;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public class UserManagerImpl extends AbstractManagerImpl implements UserManager {
	
	public UserLightDTO loginUser(String email, String password)
	{
		return getDaoFactory().getUserDao().login(email, password);
	}

}
