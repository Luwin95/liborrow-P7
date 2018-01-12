package com.liborrow.webinterface.webapp.actions;

import com.liborrow.webinterface.generated.model.itemservice.Book;
import com.liborrow.webinterface.webapp.AbstractAction;

public class BookAction extends AbstractAction {
	private Book book;
	
    public String execute() throws Exception {
        book = getManagerFactory().getBookManager().getBookById(1);
        return "success";
    }
    
	public Book getBook() {
		return book;
	}
    
	
}
