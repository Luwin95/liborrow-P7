package com.liborrow.executable;

import java.util.List;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.dto.MagazineDTO;
import org.liborrow.webservice.model.utilsobject.AuthorCriterias;
import org.liborrow.webservice.model.utilsobject.BookCriterias;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.liborrow.webservice.model.utilsobject.MagazineCriterias;
import org.liborrow.webservice.model.utilsobject.SearchResponse;
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
		String search = "le Petit";
		
		ItemCriterias itemCriterias = new ItemCriterias();
		String string = "hello";
		itemCriterias.setSimpleStringSearch(string);
		String[] splitedString = itemCriterias.getSimpleStringSearch().split("\\s+");
		/*itemCriterias.setAuthorCriterias(new AuthorCriterias());
		itemCriterias.setBookCriterias(new BookCriterias());
		itemCriterias.setMagazineCriterias(new MagazineCriterias());
		itemCriterias.getBookCriterias().setTitle(search);
		itemCriterias.getBookCriterias().setEditor(search);
		itemCriterias.getAuthorCriterias().setFirstname(search);
		itemCriterias.getAuthorCriterias().setLastname(search);
		itemCriterias.getMagazineCriterias().setName(search);*/
		List<BookDTO> books = vManagerFactory.getBookManager().searchBook(itemCriterias);
		/*List<AuthorDTO> authors = vManagerFactory.getAuthorManager().searchAuthor(itemCriterias);
		List<MagazineDTO> magazines = vManagerFactory.getMagazineManager().searchMagazine(itemCriterias);*/
		
//		SearchResponse searchResponse = vManagerFactory.getItemManager().getLastFiveItems();
//		List<BookDTO> books = searchResponse.getBooks();
////		List<AuthorDTO> authors = searchResponse.getAuthors();
////		List<MagazineDTO> magazines = searchResponse.getMagazines();
		if(books!=null)
		{
			System.out.println("Livres : ");
			for(BookDTO book : books)
			{
				System.out.println(book.getClass().getName());
				System.out.println(book.getTitle()+" publié par : "+book.getEditor());
				for(AuthorDTO author : book.getAuthors())
				{
					System.out.println(author.getFirstname()+ " " +author.getName());
				}
				for(BorrowDTO borrow: book.getBorrows())
				{
					System.out.println(borrow.getBorrower().getEmail());
				}
			}
		}
//		if(authors!=null)
//		{
//			System.out.println("Auteurs : ");
//			for(AuthorDTO author : authors)
//			{
//				System.out.println(author.getFirstname()+" "+author.getName());
//			}
//		}
//		
//		if(magazines!=null)
//		{
//			System.out.println("Magazines : ");
//			for(MagazineDTO magazine : magazines)
//			{
//				System.out.println(magazine.getName()+" n°"+magazine.getEditionNumber());
//			}
//		}
		
		
	}
}
