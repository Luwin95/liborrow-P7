package org.liborrow.webservice.model.dto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.liborrow.webservice.model.entities.WaitingList;

public class ItemDTO {

	private Long id;
	
	private String itemRef;
	
	private int totalCount;
	
	private int remainingCount;
	
	private String alley;
	
	private String place;
	
	private Set<BorrowDTO> borrows = new HashSet<>();
	
	private String itemType;
	
	private List<WaitingListDTO> reservations = new ArrayList<>();
	
	private Calendar nextReturn;
	
	private Long reservationsNumber;
	
	public ItemDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemRef() {
		return itemRef;
	}

	public void setItemRef(String itemRef) {
		this.itemRef = itemRef;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getRemainingCount() {
		return remainingCount;
	}

	public void setRemainingCount(int remainingCount) {
		this.remainingCount = remainingCount;
	}

	public String getAlley() {
		return alley;
	}

	public void setAlley(String alley) {
		this.alley = alley;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Set<BorrowDTO> getBorrows() {
		return borrows;
	}

	public void setBorrows(Set<BorrowDTO> borrows) {
		this.borrows = borrows;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public List<WaitingListDTO> getReservations() {
		return reservations;
	}

	public void setReservations(List<WaitingListDTO> reservations) {
		this.reservations = reservations;
	}
	
	public Calendar getNextReturn() {
		return nextReturn;
	}

	public void setNextReturn(Calendar nextReturn) {
		this.nextReturn = nextReturn;
	}

	public Long getReservationsNumber() {
		return reservationsNumber;
	}

	public void setReservationsNumber(Long reservationsNumber) {
		this.reservationsNumber = reservationsNumber;
	}
}
