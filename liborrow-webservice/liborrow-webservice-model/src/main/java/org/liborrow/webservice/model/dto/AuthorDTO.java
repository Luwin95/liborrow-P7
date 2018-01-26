package org.liborrow.webservice.model.dto;

import java.util.HashSet;
import java.util.Set;

public class AuthorDTO {
	private Long id;
	
	private String name;
	
	private String firstname;
	
	private int birth;
	
	private int death;
	
	private String biography;
	
	private Set<BookDTO> books = new HashSet<>(); 
	
	private Set<CitizenshipDTO> citizenships = new HashSet<>();
	
	private ImageDTO image;
	
	public AuthorDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getDeath() {
		return death;
	}

	public void setDeath(int death) {
		this.death = death;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public Set<BookDTO> getBooks() {
		return books;
	}

	public void setBooks(Set<BookDTO> books) {
		this.books = books;
	}

	public Set<CitizenshipDTO> getCitizenships() {
		return citizenships;
	}

	public void setCitizenships(Set<CitizenshipDTO> citizenships) {
		this.citizenships = citizenships;
	}

	public ImageDTO getImage() {
		return image;
	}

	public void setImage(ImageDTO image) {
		this.image = image;
	}
}
