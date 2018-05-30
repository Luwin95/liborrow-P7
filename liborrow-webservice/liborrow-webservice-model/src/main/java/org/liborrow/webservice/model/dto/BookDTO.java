package org.liborrow.webservice.model.dto;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class BookDTO extends ItemDTO{
	private String title;
	private String language;
	private Date release;
	private String summary;
	private String editor;
	private Set<AuthorDTO> authors = new HashSet<>();
	private Set<BorrowDTO> borrows = new HashSet<>();
	private ImageDTO image;


	public BookDTO() {
		// TODO Auto-generated constructor stub
	}

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

	public Set<AuthorDTO> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<AuthorDTO> authors) {
		this.authors = authors;
	}
	
	public Set<BorrowDTO> getBorrows() {
		return borrows;
	}

	public void setBorrows(Set<BorrowDTO> borrows) {
		this.borrows = borrows;
	}

	public ImageDTO getImage() {
		return image;
	}

	public void setImage(ImageDTO image) {
		this.image = image;
	}
}
