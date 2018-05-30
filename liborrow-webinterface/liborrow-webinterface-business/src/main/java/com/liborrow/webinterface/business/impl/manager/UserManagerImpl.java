package com.liborrow.webinterface.business.impl.manager;

import java.util.List;

import com.liborrow.webinterface.business.contract.manager.UserManager;
import com.liborrow.webinterface.generated.model.CitizenshipDTO;
import com.liborrow.webinterface.generated.model.UserDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public class UserManagerImpl extends AbstractManagerImpl implements UserManager {
	
	public UserLightDTO loginUser(String email, String password)
	{
		return getDaoFactory().getUserDao().login(email, password);
	}
	
	public UserLightDTO findById(long idUser) {
		return getDaoFactory().getUserDao().findById(idUser);
	}
	
	public List<String> getAllCitizenshipNames(){
		return getDaoFactory().getUserDao().getAllCitizenshipNames();
	}
	
	public CitizenshipDTO getCitizenshipByCountry(String country) {
		return getDaoFactory().getUserDao().getCitizenshipByCountry(country);
	}
	
	public void saveNewUser(UserDTO user) {
		getDaoFactory().getUserDao().saveNewUser(user);
	}
	
	public boolean isInDatabase(String email) {
		return getDaoFactory().getUserDao().checkInDatabase(email);
	}
	
	public void editUser(UserLightDTO user) {
		getDaoFactory().getUserDao().editUser(user);
	}
}
