package org.liborrow.webservice.model.utilsobject;

import java.util.Date;

public class MagazineCriterias {

	private String name;
	private int editionNumber;
	private Date publishDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEditionNumber() {
		return editionNumber;
	}
	public void setEditionNumber(int editionNumber) {
		this.editionNumber = editionNumber;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
}
