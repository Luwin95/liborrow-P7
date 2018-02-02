package com.liborrow.webinterface.webapp.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.liborrow.webinterface.webapp.AbstractAction;

public class LogoutAction extends AbstractAction implements SessionAware {
   private Map<String,Object> session;
	
   public String execute() throws Exception {
    	if(session.containsKey("sessionUser"))
    	{
    		session.clear();
    		return SUCCESS;
    	}else {
    		return "login";
    	}
    }

   public void setSession(Map<String, Object> pSession) {
	this.session=pSession;
   }
}
