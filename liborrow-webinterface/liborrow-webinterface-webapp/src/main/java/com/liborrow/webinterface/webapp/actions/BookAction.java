package com.liborrow.webinterface.webapp.actions;


import com.liborrow.webinterface.generated.model.BookDTO;
import com.liborrow.webinterface.webapp.AbstractAction;

public class BookAction extends AbstractAction {
	private BookDTO book;
	private String idBook; 
	
    public String execute() throws Exception {
        book = getManagerFactory().getBookManager().getBookById(Integer.parseInt(idBook));
        return "success";
    }
    
	public BookDTO getBook() {
		return book;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}
}
