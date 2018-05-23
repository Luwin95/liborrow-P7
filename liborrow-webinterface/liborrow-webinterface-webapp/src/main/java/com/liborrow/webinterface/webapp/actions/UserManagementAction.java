package com.liborrow.webinterface.webapp.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.liborrow.webinterface.generated.model.CitizenshipDTO;
import com.liborrow.webinterface.generated.model.UserDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class UserManagementAction extends AbstractAction implements SessionAware  {

	// ==================== Attributs ====================
    // ----- Paramètres en entrée
	protected Map<String, Object> session;
	private UserDTO user;
	private UserLightDTO userEdit;
	private String passwordRepeat;
	private String citizenshipSelected;
	private List<String> citizenships;
	
	// ----- Eléments en sortie
	
	// ==================== Getters/Setters ====================
	
	public void setSession(Map<String, Object> session) {
        this.session = session;
    }
	
	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public UserLightDTO getUserEdit() {
		return userEdit;
	}

	public void setUserEdit(UserLightDTO userEdit) {
		this.userEdit = userEdit;
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}

	public String getCitizenshipSelected() {
		return citizenshipSelected;
	}

	public void setCitizenshipSelected(String citizenshipSelected) {
		this.citizenshipSelected = citizenshipSelected;
	}

	public List<String> getCitizenships() {
		return citizenships;
	}
	
	// ==================== Méthodes ====================


	/**
	 * Affiche le formulaire d'inscription
	 * 
	 * @return success
	 */
	public String displaySignInForm() {
		citizenships = getManagerFactory().getUserManager().getAllCitizenshipNames();
		return SUCCESS;
	}
	
	/**
	 * Enregistre les données du nouvel utilisateur si les données sont intègres sinon renvoi le formulaire avec le message d'erreur
	 * 
	 * @return success/input
	 */
	public String signIn() {
		if(checkUserInformation("user") && checkPasswordInformation("user"))
		{
			CitizenshipDTO citizenshipDTO = getManagerFactory().getUserManager().getCitizenshipByCountry(citizenshipSelected);
			user.setCitizenship(citizenshipDTO);
			user.setRole("ROLE_USER");
			getManagerFactory().getUserManager().saveNewUser(user);
			return SUCCESS;
		}else {
			citizenships = getManagerFactory().getUserManager().getAllCitizenshipNames();
			return INPUT;
		}
	}
	
	/**
	 * Affiche le formulaire de modification de compte
	 * 
	 * @return success
	 */
	public String displayEditAccountForm() {
		citizenships = getManagerFactory().getUserManager().getAllCitizenshipNames();
		userEdit = (UserLightDTO) session.get("sessionUser");
		return SUCCESS;
	}
	
	/**
	 * Enregistre les données de compte modifiées par l'utilisateur
	 * 
	 * @return success/input
	 */
	public String editAccount() {
		if(checkEditUserInformation("userEdit")) {
			CitizenshipDTO citizenshipDTO = getManagerFactory().getUserManager().getCitizenshipByCountry(userEdit.getCitizenship().getCountryName());
			userEdit.setCitizenship(citizenshipDTO);
			userEdit.setRole("ROLE_USER");
			getManagerFactory().getUserManager().editUser(userEdit);
			return SUCCESS;
		}else {
			citizenships = getManagerFactory().getUserManager().getAllCitizenshipNames();
			return INPUT;
		}
	}
	
	/**
	 * Vérifie l'intégrité des mots de passe entrés
	 * 
	 * @return true si les données sont correctes/false sinon 
	 */
	private boolean checkPasswordInformation(String varName) {
		boolean response = true;
	
		if(null == user.getPassword() || user.getPassword().length()<5) {
			this.addFieldError(varName+".password", "Le mot de passe est obligatoire et doit faire au minimum 5 caractères");
			response = false;
		}
		
		if(null != user.getPassword()  && !user.getPassword().equals(passwordRepeat)) {
			this.addFieldError("passwordRepeat", "Les deux mots de passe entrés sont différents");
			response = false;
		}
		return response;
	}
	
	/**
	 * Vérifie l'intégrité des données du formulaire
	 * 
	 * @return true si les données sont correctes/false sinon 
	 */
	private boolean checkUserInformation(String varName) {
		boolean response = true;
		
		if(null == user.getEmail() || user.getEmail().length()==0) {
			this.addFieldError(varName+".email", "L'email est obligatoire");
			response = false;
		}
		
		if(null != user.getEmail() && user.getEmail().length()>0 && getManagerFactory().getUserManager().isInDatabase(user.getEmail())) {
			this.addFieldError(varName+".email", "Un compte avec cet email existe déjà");
			response = false;
		}
		
		if(null == user.getAddress() || user.getAddress().length()==0) {
			this.addFieldError(varName+".address", "L'adresse est obligatoire");
			response = false;
		}
		
		if(null == user.getPostCode() || user.getPostCode().length()==0) {
			this.addFieldError(varName+".postCode", "Le code postale est obligatoire");
			response = false;
		}
		
		if(null == user.getPhoneNumber() || user.getPhoneNumber().length()==0) {
			this.addFieldError(varName+".phoneNumber", "Le numéro de téléphone est obligatoire");
			response = false;
		}
		
		if(null == user.getLastname() || user.getLastname().length()==0) {
			this.addFieldError(varName+".lastname", "Le nom de famille est obligatoire");
			response = false;
		}
		
		if(null == user.getFirstname() || user.getFirstname().length()==0) {
			this.addFieldError(varName+".firstname", "Le nom de famille est obligatoire");
			response = false;
		}
		
		if(null == citizenshipSelected || citizenshipSelected.equals("-1")) {
			this.addFieldError("citizenshipSelected", "La nationalité est obligatoire");
			response = false;
		}
		
		return response;
	}
	
	/**
	 * Vérifie l'intégrité des données du formulaire
	 * 
	 * @return true si les données sont correctes/false sinon 
	 */
	private boolean checkEditUserInformation(String varName) {
		boolean response = true;
		
		if(null == userEdit.getEmail() || userEdit.getEmail().length()==0) {
			this.addFieldError(varName+".email", "L'email est obligatoire");
			response = false;
		}
		
		if(null != userEdit.getEmail() && userEdit.getEmail().length()>0) {
			UserLightDTO userInSession = (UserLightDTO) session.get("sessionUser");
			if(!userInSession.getEmail().equals(userEdit.getEmail())) {
				if(getManagerFactory().getUserManager().isInDatabase(userEdit.getEmail())) {
					this.addFieldError(varName+".email", "Un compte avec cet email existe déjà");
					response = false;
				}
			}
		}
		
		if(null == userEdit.getAddress() || userEdit.getAddress().length()==0) {
			this.addFieldError(varName+".address", "L'adresse est obligatoire");
			response = false;
		}
		
		if(null == userEdit.getPostCode() || userEdit.getPostCode().length()==0) {
			this.addFieldError(varName+".postCode", "Le code postale est obligatoire");
			response = false;
		}
		
		if(null == userEdit.getPhoneNumber() || userEdit.getPhoneNumber().length()==0) {
			this.addFieldError(varName+".phoneNumber", "Le numéro de téléphone est obligatoire");
			response = false;
		}
		
		if(null == userEdit.getLastname() || userEdit.getLastname().length()==0) {
			this.addFieldError(varName+".lastname", "Le nom de famille est obligatoire");
			response = false;
		}
		
		if(null == userEdit.getFirstname() || userEdit.getFirstname().length()==0) {
			this.addFieldError(varName+".firstname", "Le nom de famille est obligatoire");
			response = false;
		}
		
		if(null == userEdit.getCitizenship().getCountryName() || userEdit.getCitizenship().getCountryName().equals("-1")) {
			this.addFieldError("userEdit.citizenship.countryName", "La nationalité est obligatoire");
			response = false;
		}
		
		return response;
	}
	
}
