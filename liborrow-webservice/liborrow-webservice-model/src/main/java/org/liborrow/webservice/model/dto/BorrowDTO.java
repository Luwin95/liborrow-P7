package org.liborrow.webservice.model.dto;


import java.util.Date;

public class BorrowDTO{
	
	private long id;
	
	private Date startDate;
	
	private Date endDate;
	
	private Date getBackDate;
	
	private Date recallDate;
	
	private Boolean extended;
	
	private UserLightDTO borrower;
	
	private ItemDTO itemDTO;
	
	private BookDTO bookDTO;
	
	private MagazineDTO magazineDTO;
	
	
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

	public ItemDTO getItemDTO() {
		return itemDTO;
	}

	public void setItemDTO(ItemDTO itemDTO) {
		this.itemDTO = itemDTO;
	}

	public BookDTO getBookDTO() {
		return bookDTO;
	}

	public void setBookDTO(BookDTO bookDTO) {
		this.bookDTO = bookDTO;
	}

	public MagazineDTO getMagazineDTO() {
		return magazineDTO;
	}

	public void setMagazineDTO(MagazineDTO magazineDTO) {
		this.magazineDTO = magazineDTO;
	}

	public Date getRecallDate() {
		return recallDate;
	}

	public void setRecallDate(Date recallDate) {
		this.recallDate = recallDate;
	}
	
}
