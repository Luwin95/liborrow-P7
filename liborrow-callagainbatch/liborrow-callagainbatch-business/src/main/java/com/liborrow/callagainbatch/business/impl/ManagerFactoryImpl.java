package com.liborrow.callagainbatch.business.impl;

import com.liborrow.callagainbatch.business.contract.ManagerFactory;
import com.liborrow.callagainbatch.business.contract.manager.BorrowManager;
import com.liborrow.callagainbatch.business.contract.manager.MailManager;

public class ManagerFactoryImpl implements ManagerFactory {
	BorrowManager borrowManager;
	MailManager mailManager;

	public BorrowManager getBorrowManager() {
		return borrowManager;
	}

	public void setBorrowManager(BorrowManager borrowManager) {
		this.borrowManager = borrowManager;
	}

	public MailManager getMailManager() {
		return mailManager;
	}

	public void setMailManager(MailManager mailManager) {
		this.mailManager = mailManager;
	}
	
}
