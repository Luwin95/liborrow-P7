package org.liborrow.webservice.model.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="Author")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "author_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="birth")
	private int birth;
	
	@Column(name="death")
	private int death;
	
	@Column(name="biography")
	private String biography;
	
	@ManyToMany(mappedBy= "authors")
	private Set<Book> books = new HashSet<>(); 
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="author_citizenship",
			joinColumns=@JoinColumn(name="author_id"),
			inverseJoinColumns = @JoinColumn(name="citizenship_id"))
	private Set<Citizenship> citizenships = new HashSet<>();
	
	public Author() {}
	
	public Author(String name, String firstname, int birth, int death, String biography)
	{
		this.name=name;
		this.firstname=firstname;
		this.birth=birth;
		this.death=death;
		this.biography=biography;
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

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}

	public void removeBook(Book book) {
		books.remove(book);
	}

	public Set<Citizenship> getCitizenships() {
		return citizenships;
	}

	public void setCitizenships(Set<Citizenship> citizenships) {
		this.citizenships = citizenships;
	}
	
	public void addCitizenship(Citizenship citizenship) {
		citizenships.add(citizenship);
	}

	public void removeCitizenship(Citizenship citizenship) {
		citizenships.remove(citizenship);
	}
}
