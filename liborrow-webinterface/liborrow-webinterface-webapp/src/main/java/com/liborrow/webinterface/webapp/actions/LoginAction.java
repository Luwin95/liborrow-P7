package com.liborrow.webinterface.webapp.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.liborrow.webinterface.generated.model.userservice.UserLight;
import com.liborrow.webinterface.webapp.AbstractAction;

public class LoginAction extends AbstractAction implements SessionAware {
	private String email;
	private String message;
	private String plainPassword;
	
	protected Map<String, Object> session;
	
    public String execute() throws Exception {
    	UserLight sessionUser = getManagerFactory().getUserManager().loginUser(email, plainPassword);
    	if(sessionUser !=null)
    	{
    		session.put("sessionUser", sessionUser);
    		return SUCCESS;
    	}else {
    		setMessage("L'utilisateur lié à l'adresse "+getEmail()+" est inconnu ou le mot de passe est incorrect");
    		return INPUT;
    	}
        
    }
    
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlainPassword() {
		return plainPassword;
	}

	public void setPlainPassword(String plainPassword) {
		this.plainPassword = plainPassword;
	}
	
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
