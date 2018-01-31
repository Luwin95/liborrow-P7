package com.liborrow.webinterface.webapp.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class SaveBorrow extends AbstractAction implements SessionAware {
	private Map<String, Object> session;
	
	@Override
	public String execute() throws Exception {
		if(session.containsKey("box") && ((List<BorrowDTO>) session.get("box"))!=null && ((List<BorrowDTO>) session.get("box")).size()>0)
		{
			for(BorrowDTO borrow : ((List<BorrowDTO>) session.get("box")))
			{
				getManagerFactory().getBorrowManager().saveNewBorrow(borrow);
				
			}
			session.remove("box");
			return "success";
		}else {
			return "error";
		}
	}
	
	public void setSession(Map<String, Object> pSession) {
		this.session = pSession;
		
	}
	

}
