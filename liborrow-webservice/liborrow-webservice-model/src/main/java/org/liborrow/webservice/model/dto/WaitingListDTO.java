package org.liborrow.webservice.model.dto;

import java.util.Calendar;

public class WaitingListDTO {

	private Long id;
	
	private Calendar notificationDate;
	
	private int position;
	
	private UserLightDTO borrower;
	
	private ItemDTO item;
	
	public WaitingListDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getNotificationDate() {
		return notificationDate;
	}

	public void setNotificationDate(Calendar notificationDate) {
		this.notificationDate = notificationDate;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public UserLightDTO getBorrower() {
		return borrower;
	}

	public void setBorrower(UserLightDTO borrower) {
		this.borrower = borrower;
	}

	public ItemDTO getItem() {
		return item;
	}

	public void setItem(ItemDTO item) {
		this.item = item;
	}
	
}
