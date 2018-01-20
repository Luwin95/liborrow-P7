package org.liborrow.webservice.model.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class BorrowDTO {
	
	private long id;
	
	private Date startDate;
	
	private Date endDate;
	
	private Date getBackDate;
	
	private Boolean extended;
	
	private UserLightDTO borrower;
	
	private Set<BookDTO> books = new HashSet<>();
	
	private Set<MagazineDTO> magazines = new HashSet<>();
	
	public BorrowDTO() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getGetBackDate() {
		return getBackDate;
	}

	public void setGetBackDate(Date getBackDate) {
		this.getBackDate = getBackDate;
	}

	public Boolean getExtended() {
		return extended;
	}

	public void setExtended(Boolean extended) {
		this.extended = extended;
	}

	public UserLightDTO getBorrower() {
		return borrower;
	}

	public void setBorrower(UserLightDTO borrower) {
		this.borrower = borrower;
	}

	public Set<BookDTO> getBooks() {
		return books;
	}

	public void setBooks(Set<BookDTO> books) {
		this.books = books;
	}

	public Set<MagazineDTO> getMagazines() {
		return magazines;
	}

	public void setMagazines(Set<MagazineDTO> magazines) {
		this.magazines = magazines;
	}
}
