package com.liborrow.webinterface.webapp.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.liborrow.webinterface.generated.model.BookDTO;
import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.MagazineDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class AddToBoxAction extends AbstractAction implements SessionAware{
	private String objectType;
	private String objectId;
	private Map<String,Object> session;
	
	 public String execute() throws Exception {
		 if(null != objectId && !objectId.equals("") && null != objectType && !objectType.equals(""))
		 {
			 Map<String,Object> mapItems = new HashMap<String, Object>();
			 if(objectType.equals("book"))
		        {
		        	BookDTO book = getManagerFactory().getBookManager().getBookById(Integer.parseInt(objectId));
		        	if(book!=null)
		        	{
		        		mapItems.put("book", book);
		        		BorrowDTO borrow = getManagerFactory().getBorrowManager().initializeBorrow(mapItems);
		        		if(session.containsKey("box") )
			        	{
		        			List<BorrowDTO> box = (List<BorrowDTO>) session.get("box");
		        			box.add(borrow);
		        			session.remove("box");
		        			session.put("box", box);
			        	}else {
			        		List<BorrowDTO> box = new ArrayList<BorrowDTO>();
			        		box.add(borrow);
			        		session.put("box", box);
			        	}
		        		return "success";
		        	}else {
		        		return "error";
		        	}
		        }
		        if(objectType.equals("magazine"))
		        {
		        	
		        	MagazineDTO magazine = getManagerFactory().getMagazineManager().getMagazineById(Integer.parseInt(objectId));
		        	if(magazine!=null)
		        	{
		        		mapItems.put("magazine", magazine);
		        		BorrowDTO borrow = getManagerFactory().getBorrowManager().initializeBorrow(mapItems);
		        		if(session.containsKey("box") )
			        	{
		        			List<BorrowDTO> box = (List<BorrowDTO>) session.get("box");
		        			box.add(borrow);
		        			session.remove("box");
		        			session.put("box", box);
			        	}else {
			        		List<BorrowDTO> box = new ArrayList<BorrowDTO>();
			        		box.add(borrow);
			        		session.put("box", box);
			        	}
		        		return "success";
		        	}else {
		        		return "error";
		        	}
		        }
		        return "success";
		 }else {
			 return "error";
		 }
	 }
	 
	 public void setSession(Map<String, Object> session) {
			this.session = session;
		}

	 
}
