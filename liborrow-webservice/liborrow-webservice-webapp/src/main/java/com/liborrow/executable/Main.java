package com.liborrow.executable;

import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
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
		
		Book book = vManagerFactory.getBookManager().findBookById(1);
		for(Author author : book.getAuthors())
		{
			System.out.println(author.getName());
			for(Book bookTemp : author.getBooks())
			{
				System.out.println(bookTemp.getTitle());
			}
		}
	}

}
