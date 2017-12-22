package org.liborrow.webservice.model.entities;

import java.time.Year;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book extends Item {
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "release")
	private Year release;
	
	@Column(name = "summary")
	private String summary;
	
	@Column(name = "editor")
	private String editor;
	
	public Book() {}
	
	public Book (String title, String language, Year release, String summary, String editor) 
	{
		this.title = title;
		this.language = language;
		this.release = release;
		this.summary = summary;
		this.editor = editor;
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

	public Year getRelease() {
		return release;
	}

	public void setRelease(Year release) {
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
}
