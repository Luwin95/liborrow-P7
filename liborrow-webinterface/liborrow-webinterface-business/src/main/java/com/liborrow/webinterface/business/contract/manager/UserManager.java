package com.liborrow.webinterface.business.contract.manager;

import com.liborrow.webinterface.generated.model.userservice.UserLight;

public interface UserManager {
	UserLight loginUser(String email, String password);
}
