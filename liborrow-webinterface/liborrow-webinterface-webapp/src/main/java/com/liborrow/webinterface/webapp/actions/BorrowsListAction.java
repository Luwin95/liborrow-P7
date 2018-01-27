package com.liborrow.webinterface.webapp.actions;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.struts2.interceptor.SessionAware;

import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class BorrowsListAction extends AbstractAction implements SessionAware{
	
	private  List<BorrowDTO> borrows;
	private GregorianCalendar now = new GregorianCalendar();
	protected Map<String,Object> session;
	
	public String execute() throws Exception {
		borrows = getManagerFactory().getBorrowManager().getAllOnGoingBorrowByUserLogged((UserLightDTO) session.get("sessionUser"));
        return "success";
    }

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<BorrowDTO> getBorrows() {
		return borrows;
	}

	public GregorianCalendar getNow() {
		return now;
	}
	
}
