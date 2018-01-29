package com.liborrow.webinterface.webapp.actions;

import java.util.List;

import com.liborrow.webinterface.generated.model.UserCriterias;
import com.liborrow.webinterface.generated.model.UserLightDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class NewBorrowAction extends AbstractAction{
	private UserCriterias userCriterias;
	private List<UserLightDTO> users;
	private String message;
	
	public String execute() throws Exception {
		users = getManagerFactory().getUserManager().searchUser(userCriterias);
    	return SUCCESS;
	}

	public UserCriterias getUserCriterias() {
		return userCriterias;
	}

	public void setUserCriterias(UserCriterias userCriterias) {
		this.userCriterias = userCriterias;
	}

	public List<UserLightDTO> getUsers() {
		return users;
	}

	public String getMessage() {
		return message;
	}
	
}
