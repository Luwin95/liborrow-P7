package org.liborrow.webservice.model.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity(name="Magazine")
public class Magazine extends Item {
	
	@Column(name = "editionnumber")
	private int editionNumber;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="publishdate")
	private Date publishDate;
	
	@ManyToMany(mappedBy="magazines")
	private Set<Borrow> borrows = new HashSet<>();
	
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

	public Set<Borrow> getBorrows() {
		return borrows;
	}

	public void setBorrows(Set<Borrow> borrows) {
		this.borrows = borrows;
	}
}
