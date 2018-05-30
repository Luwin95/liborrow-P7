package com.liborrow.webinterface.consumer.contract.dao;

import java.util.List;

import com.liborrow.webinterface.generated.model.CitizenshipDTO;
import com.liborrow.webinterface.generated.model.UserDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public interface UserDao {
	UserLightDTO login(String email, String password);
	UserLightDTO findById(long idUser);
	List<String> getAllCitizenshipNames();
	CitizenshipDTO getCitizenshipByCountry(String country);
	void saveNewUser (UserDTO user);
	boolean checkInDatabase(String email);
	void editUser (UserLightDTO user);
}
