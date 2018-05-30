package com.liborrow.webinterface.consumer.impl.dao;


import java.util.List;

import com.liborrow.webinterface.consumer.contract.dao.UserDao;
import com.liborrow.webinterface.generated.model.CitizenshipDTO;
import com.liborrow.webinterface.generated.model.UserDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public class UserDaoImpl extends AbstractDao implements UserDao {
	
	public UserLightDTO login(String email, String password)
	{
		return getUserSrv().loginUser(email, password);
	}
	
	public UserLightDTO findById(long idUser) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<String> getAllCitizenshipNames (){
		return getUserSrv().getAllCitizenshipsNames();
	}
	
	public CitizenshipDTO getCitizenshipByCountry(String country) {
		return getUserSrv().getCitizenshipByCountry(country);
	}
	
	public void saveNewUser (UserDTO user) {
		getUserSrv().saveNewUser(user);
	}
	
	public boolean checkInDatabase(String email) {
		return getUserSrv().isInDatabase(email);
	}
	
	public void editUser (UserLightDTO user) {
		getUserSrv().updateUser(user);
	}
}
