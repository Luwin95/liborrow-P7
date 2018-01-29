package com.liborrow.webinterface.consumer.contract.dao;

import java.util.List;

import com.liborrow.webinterface.generated.model.UserCriterias;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public interface UserDao {
	UserLightDTO login(String email, String password);
	List<UserLightDTO> searchUser(UserCriterias userCriterias);

}
