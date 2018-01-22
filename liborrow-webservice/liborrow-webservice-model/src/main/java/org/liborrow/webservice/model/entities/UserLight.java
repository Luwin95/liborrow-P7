package org.liborrow.webservice.model.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="UserLight")
@Table(name="user_account")
public class UserLight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id", updatable = false, nullable = false)
	private long id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="address")
	private String address;
	
	@Column(name="postcode")
	private String postCode;
	
	@Column(name="phonenumber")
	private String phoneNumber;
	
	@Column(name="role")
	private String role;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "citizenship_id")
	private Citizenship citizenship;
	
	@OneToMany(mappedBy="borrower")
	private Set<Borrow> borrows = new HashSet<>();

	public UserLight() {}
	
	public UserLight(String email, String firstname, String lastname, String address, String postCode, String phoneNumber, Citizenship citizenship)
	{
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.postCode = postCode;
		this.phoneNumber = phoneNumber;
		this.citizenship = citizenship;
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

	public Citizenship getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(Citizenship citizenship) {
		this.citizenship = citizenship;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<Borrow> getBorrows() {
		return borrows;
	}

	public void setBorrows(Set<Borrow> borrows) {
		this.borrows = borrows;
	}
}
