package com.liborrow.webinterface.business.contract.manager;

import java.util.List;

import com.liborrow.webinterface.generated.model.UserCriterias;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public interface UserManager {
	UserLightDTO loginUser(String email, String password);
	List<UserLightDTO> searchUser(UserCriterias userCriterias);
}
