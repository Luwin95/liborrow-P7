package com.liborrow.webinterface.webapp.actions;


import com.liborrow.webinterface.generated.model.itemservice.BookDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class BookAction extends AbstractAction {
	private BookDTO book;
	
    public String execute() throws Exception {
        book = getManagerFactory().getBookManager().getBookById(1);
        return "success";
    }
    
	public BookDTO getBook() {
		return book;
	}
}
