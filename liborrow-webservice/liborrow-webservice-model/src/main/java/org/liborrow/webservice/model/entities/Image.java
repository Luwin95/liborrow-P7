package org.liborrow.webservice.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Image")
public class Image implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "image_id", updatable = false, nullable = false)
	private long id;

	@Column(name = "alt")
	private String alt;
	
	@Column(name = "path")
	private String path;
	
	@Column(name = "title")
	private String title;
	
	public Image() {}
	
	public Image(String pAlt, String pPath, String pTitle) {
		this.alt = pAlt;
		this.path = pPath;
		this.title = pTitle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
