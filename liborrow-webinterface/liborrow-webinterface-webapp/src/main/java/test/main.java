package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liborrow.webinterface.business.contract.ManagerFactory;
import com.liborrow.webinterface.generated.itemService.Book;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ApplicationContext vApplicationContext
		        = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

				// Il est possible de récupérer un bean dans ce contexte :
				ManagerFactory vManagerFactory
		        = vApplicationContext.getBean("managerFactory", ManagerFactory.class);
				
				
				Book book = vManagerFactory.getBookManager().getBookById(1);
				
				System.out.println(book.getTitle());
	}

}
