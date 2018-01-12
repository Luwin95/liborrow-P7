package com.liborrow.executable;

import java.util.List;

import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.utilsobject.BookCriterias;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liborrow.webservice.AbstractService;
import com.liborrow.webservice.business.contract.ManagerFactory;

public class Main extends AbstractService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext vApplicationContext
        = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

		// Il est possible de r�cup�rer un bean dans ce contexte :
		ManagerFactory vManagerFactory
        = vApplicationContext.getBean("managerFactory", ManagerFactory.class);
		
		ItemCriterias itemCriterias = new ItemCriterias();
		itemCriterias.setBookCriterias(new BookCriterias());
		itemCriterias.getBookCriterias().setTitle("Hello");
		List<Book> books = vManagerFactory.getBookManager().searchBook(itemCriterias);
		for(Book book : books)
		{
			System.out.println(book.getTitle()+" publi� par : "+book.getEditor());
		}
	}
}
