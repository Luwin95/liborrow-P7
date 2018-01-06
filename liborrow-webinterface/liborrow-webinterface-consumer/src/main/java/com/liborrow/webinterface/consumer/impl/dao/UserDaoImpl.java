package com.liborrow.webinterface.consumer.impl.dao;

import com.liborrow.webinterface.consumer.contract.dao.UserDao;
import com.liborrow.webinterface.generated.model.UserLight;

public class UserDaoImpl extends AbstractDao implements UserDao {
	
	public UserLight login(String email, String password)
	{
		return getUserSrv().loginUser(email, password);
	}
}
