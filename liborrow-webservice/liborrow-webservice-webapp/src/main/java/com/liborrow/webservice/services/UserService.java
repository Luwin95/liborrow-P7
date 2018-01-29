package com.liborrow.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.utilsobject.UserCriterias;

import com.liborrow.webservice.AbstractService;

@WebService(name = "UserClient", serviceName = "UserService", portName = "UserPort", targetNamespace="model.generated.webinterface.liborrow.com")
public class UserService extends AbstractService {
	
	@WebMethod
	public UserLightDTO loginUser(String email, String password)
	{
		return getManagerFactory().getUserManager().login(email, password);
	}
	
	@WebMethod
	public List<UserLightDTO> searchUser(UserCriterias userCriterias)
	{
		return getManagerFactory().getUserManager().searchUser(userCriterias);
	}
}
