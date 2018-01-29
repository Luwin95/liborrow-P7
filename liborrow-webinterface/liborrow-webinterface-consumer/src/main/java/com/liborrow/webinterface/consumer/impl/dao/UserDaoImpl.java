package com.liborrow.webinterface.consumer.impl.dao;

import java.util.List;

import com.liborrow.webinterface.consumer.contract.dao.UserDao;
import com.liborrow.webinterface.generated.model.UserCriterias;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public class UserDaoImpl extends AbstractDao implements UserDao {
	
	public UserLightDTO login(String email, String password)
	{
		return getUserSrv().loginUser(email, password);
	}
	
	public List<UserLightDTO> searchUser(UserCriterias userCriterias) {
		return getUserSrv().searchUser(userCriterias);
	}
}
