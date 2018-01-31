package com.liborrow.callagainbatch.consumer.impl;

import com.liborrow.webinterface.generated.model.BorrowClient;
import com.liborrow.webinterface.generated.model.BorrowService;

public abstract class AbstractDaoImpl {
	private BorrowService borrowService = new BorrowService();
	private BorrowClient borrowSrv = borrowService.getBorrowPort();
	
	public BorrowClient getBorrowSrv() {
		return borrowSrv;
	}
	public void setBorrowSrv(BorrowClient borrowSrv) {
		this.borrowSrv = borrowSrv;
	}
}
