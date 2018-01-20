package com.liborrow.webservice.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.liborrow.webservice.model.dto.UserLightDTO;
import com.liborrow.webservice.AbstractService;

@WebService(name = "UserClient", serviceName = "UserService", portName = "UserPort", targetNamespace="userservice.model.generated.webinterface.liborrow.com")
public class UserService extends AbstractService {
	
	@WebMethod
	public UserLightDTO loginUser(String email, String password)
	{
		return getManagerFactory().getUserManager().login(email, password);
	}
}
