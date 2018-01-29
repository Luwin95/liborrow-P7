package org.liborrow.webservice.consumer.contract.dao;

import java.util.List;
import java.util.Set;

import org.liborrow.webservice.model.entities.UserLight;
import org.liborrow.webservice.model.utilsobject.UserCriterias;

public interface UserDao {
	Set<UserLight> searchUser(UserCriterias userCriterias);

}
