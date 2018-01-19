package org.liborrow.webservice.model.dto;

import java.util.Date;

public class MagazineDTO extends ItemDTO {
	
	private int editionNumber;
	
	private String name;
	
	private Date publishDate;
	
	public MagazineDTO() {
		// TODO Auto-generated constructor stub
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
