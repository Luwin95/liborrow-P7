package org.liborrow.webservice.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="Book")
public class Book extends Item implements Serializable{
	
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "book_id", updatable = false, nullable = false)
//	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "release")
	private Date release;
	
	@Column(name = "summary")
	private String summary;
	
	@Column(name = "editor")
	private String editor;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="author_book",
			joinColumns= @JoinColumn(name="item_id"),
			inverseJoinColumns = @JoinColumn(name="author_id"))
	private Set<Author> authors = new HashSet<>();
	
//	@OneToMany(mappedBy="book")
//	private Set<Borrow> borrows = new HashSet<>();
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "image_id")
	private Image image;
	
	public Book() {}
	
	public Book (String title, String language, Date release, String summary, String editor, Set<Author> authors) 
	{
		this.title = title;
		this.language = language;
		this.release = release;
		this.summary = summary;
		this.editor = editor;
		this.authors = authors;
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getRelease() {
		return release;
	}

	public void setRelease(Date release) {
		this.release = release;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public void addAuthor(Author author) {
		authors.add(author);
		author.addBook(this);
	}

	public void removeAuthor(Author author) {
		authors.remove(author);
		author.removeBook(this);
	}

//	public Set<Borrow> getBorrows() {
//		return borrows;
//	}
//
//	public void setBorrows(Set<Borrow> borrows) {
//		this.borrows = borrows;
//	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}
