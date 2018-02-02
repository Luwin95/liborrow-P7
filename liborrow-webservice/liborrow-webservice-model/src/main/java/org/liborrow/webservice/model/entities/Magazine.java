package org.liborrow.webservice.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Magazine")
@Table(name="magazine")
public class Magazine extends Item implements Serializable{
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "magazine_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "editionnumber")
	private int editionNumber;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="publishdate")
	private Date publishDate;
	
	@OneToMany(mappedBy="magazine")
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
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
