package com.liborrow.webinterface.webapp.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class DeleteFromBoxAction extends AbstractAction implements SessionAware {
	private Map<String,Object> session;
	private String idBorrow;
	
	@Override
	public String execute() throws Exception {
		if(idBorrow!=null && !idBorrow.equals(""))
		{
			if(session.containsKey("box") && ((List<BorrowDTO>) session.get("box")).size()>=(Integer.parseInt(idBorrow)+1))
			{
				List<BorrowDTO> borrows = ((List<BorrowDTO>) session.get("box"));
				BorrowDTO borrowToDelete = borrows.get(Integer.parseInt(idBorrow));
				borrows.remove(borrowToDelete);
				session.remove("box");
				session.put("box", borrows);
				return "success";
			}else{
				return "error";
			}
		}else {
			return "error";
			
		}
	}
	
	public void setSession(Map<String, Object> pSession) {
		this.session = pSession;
	}
	

}
