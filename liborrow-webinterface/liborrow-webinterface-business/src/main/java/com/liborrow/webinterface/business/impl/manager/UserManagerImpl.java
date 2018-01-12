package com.liborrow.webinterface.business.impl.manager;

import com.liborrow.webinterface.business.contract.manager.UserManager;
import com.liborrow.webinterface.generated.model.userservice.UserLight;

public class UserManagerImpl extends AbstractManagerImpl implements UserManager {
	
	public UserLight loginUser(String email, String password)
	{
		return getDaoFactory().getUserDao().login(email, password);
	}

}
