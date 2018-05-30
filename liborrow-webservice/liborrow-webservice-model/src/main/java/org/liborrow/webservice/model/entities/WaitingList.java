package org.liborrow.webservice.model.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="waiting_list")
public class WaitingList implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "waiting_list_id", updatable = false, nullable = false)
	private Long id;
	
	@Column
	private Calendar notificationDate;
	
	@Column
	private int position;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
	private UserLight borrower;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_id")
	private Item item;
	
	public WaitingList() {}
	
	public WaitingList(Calendar notificationDate, int position, UserLight borrower, Item item) {
		this.notificationDate = notificationDate;
		this.position = position;
		this.borrower = borrower;
		this.item = item;
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

	public UserLight getBorrower() {
		return borrower;
	}

	public void setBorrower(UserLight borrower) {
		this.borrower = borrower;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
