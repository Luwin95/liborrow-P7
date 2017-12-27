package org.liborrow.webservice.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="Magazine")
public class Magazine extends Item {
	
	@Column(name = "editionnumber")
	private int editionNumber;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="publishdate")
	private Date publishDate;
	
	public Magazine() {}
	
	public Magazine(int editionNumber, String name, Date publishDate) 
	{
		this.editionNumber = editionNumber;
		this.name = name;
		this.publishDate = publishDate;
	}

	public int getEditionNumber() {
		return editionNumber;
	}

	public void setEditionNumber(int editionNumber) {
		this.editionNumber = editionNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
}
