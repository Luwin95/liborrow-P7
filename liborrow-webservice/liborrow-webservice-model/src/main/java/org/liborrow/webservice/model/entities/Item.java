package org.liborrow.webservice.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.InheritanceType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance( strategy = InheritanceType.JOINED)
public abstract class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "item_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name="itemref")
	private String itemRef;
	
	@Column(name="totalcount")
	private int totalCount;
	
	@Column(name="remainingcount")
	private int remainingCount;
	
	@Column(name="alley")
	private String alley;
	
	@Column(name="place")
	private String place;
	
	public Item() {}
	
	public Item(String itemRef, int totalCount, int remainingCount, String alley, String place) 
	{
		this.itemRef = itemRef;
		this.totalCount = totalCount;
		this.remainingCount = remainingCount;
		this.alley = alley;
		this.place = place;
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
}
