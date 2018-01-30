package com.liborrow.webinterface.webapp.actions;

import java.util.ArrayList;
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
			 if(objectType.equals("book"))
		        {
		        	BookDTO book = getManagerFactory().getBookManager().getBookById(Integer.parseInt(objectId));
		        	if(book!=null)
		        	{
		        		if(session.containsKey("box") )
			        	{
			        		
			        	}else {
			        		
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
		        		if(session.containsKey("box") )
			        	{
			        		
			        	}else {
			        		List<BorrowDTO> box = new ArrayList<>();
			        		
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
