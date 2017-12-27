package org.liborrow.webservice.model.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="Citizenship")
public class Citizenship {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "citizenship_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name="countryname")
	private String countryName;
	
	@ManyToMany(mappedBy= "citizenships")
	private Set<Author> authors = new HashSet<>();
	
	public Citizenship() {}
	
	public Citizenship(String countryName)
	{
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public void addAuthor(Author author) {
		authors.add(author);
	}

	public void removeAuthor(Author author) {
		authors.remove(author);
	}
}
