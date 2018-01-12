package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.userservice.UserLight;

public interface UserDao {
	UserLight login(String email, String password);

}
