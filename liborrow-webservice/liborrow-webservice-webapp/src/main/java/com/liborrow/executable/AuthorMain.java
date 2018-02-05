package com.liborrow.executable;

import java.util.List;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.dto.CitizenshipDTO;
import org.liborrow.webservice.model.utilsobject.SearchResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liborrow.webservice.business.contract.ManagerFactory;

public class AuthorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext vApplicationContext
				= new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

				// Il est possible de récupérer un bean dans ce contexte :
			ManagerFactory vManagerFactory
			    = vApplicationContext.getBean("managerFactory", ManagerFactory.class);
			
			SearchResponse searchResponse = vManagerFactory.getItemManager().getLastFiveItems();
			for(AuthorDTO author : searchResponse.getAuthors())
			{
				System.out.println(author.getName()+" "+ author.getFirstname());
				for(BookDTO book : author.getBooks())
				{
					System.out.println(book.getTitle());
				}
				for(CitizenshipDTO citizenship : author.getCitizenships())
				{
					System.out.println(citizenship.getCountryName());
				}
			}

	}

}
