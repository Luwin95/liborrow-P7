package org.liborrow.webservice.model.dto;

import java.util.HashSet;
import java.util.Set;

public class CitizenshipDTO {

	private Long id;
	
	private String countryName;
	
	private Set<AuthorDTO> authors = new HashSet<>();
	
	public CitizenshipDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Set<AuthorDTO> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<AuthorDTO> authors) {
		this.authors = authors;
	}
	
	
}

