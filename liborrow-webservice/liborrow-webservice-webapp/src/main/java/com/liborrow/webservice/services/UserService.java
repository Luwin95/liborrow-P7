package com.liborrow.webservice.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.liborrow.webservice.model.entities.UserLight;

import com.liborrow.webservice.AbstractService;

@WebService(name = "userClient", serviceName = "UserService", portName = "UserPort")
public class UserService extends AbstractService {
	
	@WebMethod
	public UserLight loginUser(String email, String password)
	{
		return getManagerFactory().getUserManager().login(email, password);
	}
}
