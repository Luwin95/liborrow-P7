package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.UserLightDTO;

public interface UserDao {
	UserLightDTO login(String email, String password);
	UserLightDTO findById(long idUser);

}
