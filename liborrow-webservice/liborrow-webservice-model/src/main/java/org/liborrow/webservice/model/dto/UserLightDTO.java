package org.liborrow.webservice.model.dto;

import java.util.HashSet;
import java.util.Set;

public class UserLightDTO {
	private long id;
	
	private String email;
	
	private String firstname;
	
	private String lastname;
	
	private String address;
	
	private String postCode;
	
	private String phoneNumber;
	
	private String role;
	
	private CitizenshipDTO citizenship;
	
	private Set<BorrowDTO> borrows = new HashSet<>();
	
	public UserLightDTO() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public CitizenshipDTO getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(CitizenshipDTO citizenship) {
		this.citizenship = citizenship;
	}

	public Set<BorrowDTO> getBorrows() {
		return borrows;
	}

	public void setBorrows(Set<BorrowDTO> borrows) {
		this.borrows = borrows;
	}
	
}
