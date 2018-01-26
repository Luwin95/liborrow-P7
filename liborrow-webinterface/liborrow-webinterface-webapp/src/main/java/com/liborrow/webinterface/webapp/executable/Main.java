package com.liborrow.webinterface.webapp.executable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liborrow.webinterface.business.contract.ManagerFactory;
import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.MagazineCriterias;
import com.liborrow.webinterface.generated.model.SearchResponse;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ApplicationContext vApplicationContext
		        = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

				// Il est possible de récupérer un bean dans ce contexte :
				ManagerFactory vManagerFactory
		        = vApplicationContext.getBean("managerFactory", ManagerFactory.class);
				
				ItemCriterias itemCriterias = new ItemCriterias();
				itemCriterias.setMagazineCriterias(new MagazineCriterias());
				itemCriterias.getMagazineCriterias().setName("le");
				SearchResponse searchResponse = vManagerFactory.getItemManager().searchItem(itemCriterias);
				System.out.println("test");

	}

}
