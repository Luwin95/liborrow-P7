package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.userservice.UserLightDTO;

public interface UserDao {
	UserLightDTO login(String email, String password);

}
