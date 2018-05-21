package com.liborrow.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.liborrow.webservice.model.dto.CitizenshipDTO;
import org.liborrow.webservice.model.dto.UserDTO;
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
	
	@WebMethod
	public UserLightDTO findUserByid(long idUser)
	{
		return getManagerFactory().getUserManager().findById(idUser);
	}
	
	@WebMethod
	public void createUser(UserDTO user)
	{
		getManagerFactory().getUserManager().createUser(user);
	}
	
	@WebMethod
	public void updateUser(UserLightDTO user)
	{
		getManagerFactory().getUserManager().updateUser(user);
	}
	
	@WebMethod
	public void deleteUser(UserDTO user)
	{
		getManagerFactory().getUserManager().deleteUser(user);
	}
	
	@WebMethod
	public List<String> getAllCitizenshipsNames(){
		return getManagerFactory().getUserManager().getAllCitizenshipsName();
	}
	
	@WebMethod
	public void saveNewUser(UserDTO user) {
		getManagerFactory().getUserManager().saveNewUser(user);
	}
	
	@WebMethod
	public CitizenshipDTO getCitizenshipByCountry (String country) {
		return getManagerFactory().getUserManager().getCitizenshipByCountry(country);
	}
	
	@WebMethod
	public boolean isInDatabase(String email) {
		return getManagerFactory().getUserManager().isInDatabase(email);
	}
}
