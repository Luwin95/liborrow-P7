package org.liborrow.webservice.model.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="Magazine")
@DiscriminatorValue("2")
public class Magazine extends Item {
	
	@Column(name = "editionnumber")
	private int editionNumber;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="publishdate")
	private Date publishDate;
	
	@OneToMany(mappedBy="item")
	private Set<Borrow> borrows = new HashSet<>();
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "image_id")
	private Image image;
	
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

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}
