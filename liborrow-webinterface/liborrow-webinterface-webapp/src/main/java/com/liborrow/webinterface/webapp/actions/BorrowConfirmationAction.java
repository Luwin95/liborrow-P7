package com.liborrow.webinterface.webapp.actions;

import java.util.List;
import java.util.Map;


import org.apache.struts2.interceptor.SessionAware;

import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class BorrowConfirmationAction extends AbstractAction implements SessionAware {
	private String idUser;
	private Map<String, Object> session;
	
	@Override
	public String execute() throws Exception {
		if(idUser !=null && !idUser.equals(""))
		{
			UserLightDTO user = getManagerFactory().getUserManager().findById(Long.parseLong(idUser));
			if(session.containsKey("box") && ((List<BorrowDTO>) session.get("box")).size()>0)
			{
				List<BorrowDTO> borrowsInBox = (List<BorrowDTO>) session.get("box");
				for(BorrowDTO borrow : borrowsInBox)
				{
					borrow.setBorrower(user);
				}
				session.remove("box");
				session.put("box", borrowsInBox);
				return "success";
			}else {
				return "error";
			}
		}else {
			return "error";
		}
	}
	
	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	
	public void setSession(Map<String, Object> pSession) {
		// TODO Auto-generated method stub
		this.session = pSession;
	}
	
	
	

}
