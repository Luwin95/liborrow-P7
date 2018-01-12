package com.liborrow.webinterface.webapp.executable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liborrow.webinterface.business.contract.ManagerFactory;
import com.liborrow.webinterface.generated.model.itemservice.AuthorCriterias;
import com.liborrow.webinterface.generated.model.itemservice.Book;
import com.liborrow.webinterface.generated.model.itemservice.BookCriterias;
import com.liborrow.webinterface.generated.model.itemservice.ItemCriterias;
import com.liborrow.webinterface.generated.model.itemservice.MagazineCriterias;
import com.liborrow.webinterface.generated.model.itemservice.SearchResponse;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ApplicationContext vApplicationContext
		        = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

				// Il est possible de récupérer un bean dans ce contexte :
				ManagerFactory vManagerFactory
		        = vApplicationContext.getBean("managerFactory", ManagerFactory.class);
				
				ItemCriterias itemCriterias = new ItemCriterias();
				itemCriterias.setAuthorCriterias(new AuthorCriterias());
				itemCriterias.setBookCriterias(new BookCriterias());
				itemCriterias.setMagazineCriterias(new MagazineCriterias());
				itemCriterias.getBookCriterias().setTitle("Hello");
				//itemCriterias.getBookCriterias().setEditor("Hello");
				itemCriterias.getAuthorCriterias().setFirstname("Hello");
				itemCriterias.getAuthorCriterias().setLastname("Hello");
				itemCriterias.getMagazineCriterias().setName("Hello");
				SearchResponse searchResponse = vManagerFactory.getItemManager().searchItem(itemCriterias);
				for(Book book : searchResponse.getBooks())
				{
					System.out.println(book.getTitle());
				}
				System.out.println("test");
				
	}

}
