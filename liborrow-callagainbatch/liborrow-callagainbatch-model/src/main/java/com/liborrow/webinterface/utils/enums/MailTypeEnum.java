package com.liborrow.webinterface.utils.enums;

public enum MailTypeEnum {
	MAIL_LATE_BORROW("mail_late_borrow"),
	MAIL_RESERVATION_AVAILABLE("mail_reservation_available");
	
	private String name = "";
	
	private MailTypeEnum(String name) {
		this.name = name;
	}
	
	public String toString(){
	    return name;
	}

}
