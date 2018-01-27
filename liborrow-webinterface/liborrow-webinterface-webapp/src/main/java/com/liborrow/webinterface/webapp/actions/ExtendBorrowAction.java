package com.liborrow.webinterface.webapp.actions;

import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class ExtendBorrowAction extends AbstractAction {
	private String idBorrow;
	private BorrowDTO borrow;

	public String execute() throws Exception {
		borrow = getManagerFactory().getBorrowManager().getBorrowById(Integer.parseInt(idBorrow));
		boolean isUpdated = getManagerFactory().getBorrowManager().markBorrow(borrow);
		if(isUpdated)
		{
			return "success";
		}else {
			return "error";
		}
    }
	
	public BorrowDTO getBorrow() {
		return borrow;
	}
	public void setBorrow(BorrowDTO borrow) {
		this.borrow = borrow;
	}

	public String getIdBorrow() {
		return idBorrow;
	}

	public void setIdBorrow(String idBorrow) {
		this.idBorrow = idBorrow;
	}
	

}
