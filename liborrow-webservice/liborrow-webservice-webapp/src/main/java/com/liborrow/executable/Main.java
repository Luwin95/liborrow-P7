package com.liborrow.executable;

import java.util.List;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.dto.BookDTO;
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

		// Il est possible de récupérer un bean dans ce contexte :
		ManagerFactory vManagerFactory
        = vApplicationContext.getBean("managerFactory", ManagerFactory.class);
		
		ItemCriterias itemCriterias = new ItemCriterias();
		itemCriterias.setBookCriterias(new BookCriterias());
		itemCriterias.getBookCriterias().setTitle("Hello");
		List<BookDTO> books = vManagerFactory.getBookManager().searchBook(itemCriterias);
		for(BookDTO book : books)
		{
			System.out.println(book.getTitle()+" publié par : "+book.getEditor());
			for(AuthorDTO author : book.getAuthors())
			{
				System.out.println(author.getFirstname()+ " " +author.getName());
			}
		}
	}
}
