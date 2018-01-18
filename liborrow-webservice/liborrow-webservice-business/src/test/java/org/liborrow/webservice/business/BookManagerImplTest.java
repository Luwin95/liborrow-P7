package org.liborrow.webservice.business;

import org.junit.Test;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liborrow.webservice.business.contract.manager.BookManager;
import com.liborrow.webservice.business.impl.manager.BookManagerImpl;


import static org.junit.Assert.fail;
import static org.junit.Assert.*;

import org.junit.Before;


public class BookManagerImplTest{

	@Autowired
	private BookManager bookManager;
	
	@Before
	public void setUp() throws Exception {
		//this.bookManager = new BookManagerImpl();
	}

	public BookManager getBookManager() {
		return bookManager;
	}

	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void findBookByIdTest()
	{
		try {
			BookDTO bookDTO = bookManager.findBookById(1);
			org.junit.Assert.assertNotNull(bookDTO);
		}catch(Exception e)
		{
			fail("Test non nul échoué");
		}
	}
}
