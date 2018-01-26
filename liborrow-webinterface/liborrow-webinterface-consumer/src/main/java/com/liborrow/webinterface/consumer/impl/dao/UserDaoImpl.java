package com.liborrow.webinterface.consumer.impl.dao;

import com.liborrow.webinterface.consumer.contract.dao.UserDao;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public class UserDaoImpl extends AbstractDao implements UserDao {
	
	public UserLightDTO login(String email, String password)
	{
		return getUserSrv().loginUser(email, password);
	}
}
