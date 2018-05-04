package com.liborrow.webinterface.webapp.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.liborrow.webinterface.generated.model.UserLightDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class AuthenticationManagementAction  extends AbstractAction implements SessionAware  {

	// ==================== Attributs ====================
    // ----- Paramètres en entrée
	private String email;
	private String message;
	private String plainPassword;
	protected Map<String, Object> session;
	
	// ----- Eléments en sortie
	
	// ==================== Getters/Setters ====================
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
	
	// ==================== Méthodes ====================
	/**
	 * Authentifie un utilisateur
	 * 
	 * @return success/input
	 */
	public String login() {
    	UserLightDTO sessionUser = getManagerFactory().getUserManager().loginUser(email, plainPassword);
    	if(sessionUser !=null)
    	{
    		session.put("sessionUser", sessionUser);
    		return SUCCESS;
    	}else {
    		setMessage("L'utilisateur lié à l'adresse "+getEmail()+" est inconnu ou le mot de passe est incorrect");
    		return INPUT;
    	}
	}
	
	/**
	 * Vide la session lors de la deconnexion d'un utilisateur
	 * 
	 * @return success/login
	 */
	public String logout() {
		if(session.containsKey("sessionUser"))
    	{
    		session.clear();
    		return SUCCESS;
    	}else {
    		return "login";
    	}
	}
}
	
