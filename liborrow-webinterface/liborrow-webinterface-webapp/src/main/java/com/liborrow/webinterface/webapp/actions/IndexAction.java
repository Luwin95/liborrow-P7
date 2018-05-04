/*
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liborrow.webinterface.webapp.actions;


import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.SearchResponse;
import com.liborrow.webinterface.generated.model.UserLightDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

import java.util.GregorianCalendar;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.conversion.annotations.Conversion;

/**
 * 
 */
@Conversion()
public class IndexAction extends AbstractAction implements SessionAware {
	
	private Map<String, Object> session;
	private SearchResponse searchResponse;
	private int nbLate;
	private int nbBorrows;
	private GregorianCalendar now = new GregorianCalendar();
	
    public String execute() throws Exception {
        searchResponse= getManagerFactory().getItemManager().findLastFiveItems();
        UserLightDTO user = (UserLightDTO) session.get("sessionUser");
        for(BorrowDTO borrow : user.getBorrows())
        {
        	if(borrow.getGetBackDate() == null)
        	{
        		nbBorrows++;
        	}
        	if(borrow.getGetBackDate() == null && now.compareTo(borrow.getEndDate().toGregorianCalendar())>0)
        	{
        		nbLate++;
        	}
        }
        return SUCCESS;
    }

	public SearchResponse getSearchResponse() {
		return searchResponse;
	}
	
	public void setSession(Map<String, Object> session) {
        this.session = session;
    }

	public int getNbLate() {
		return nbLate;
	}

	public int getNbBorrows() {
		return nbBorrows;
	}
}
