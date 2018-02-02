package com.liborrow.callagainbatch.business.contract;

import com.liborrow.callagainbatch.business.contract.manager.BorrowManager;
import com.liborrow.callagainbatch.business.contract.manager.MailManager;

public interface ManagerFactory {
	BorrowManager getBorrowManager();
	void setBorrowManager(BorrowManager borrowManager);
	MailManager getMailManager();
	void setMailManager(MailManager mailManager);
}
