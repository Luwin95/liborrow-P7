package com.liborrow.webinterface.business.contract.manager;

import com.liborrow.webinterface.generated.model.userservice.UserLightDTO;

public interface UserManager {
	UserLightDTO loginUser(String email, String password);
}
