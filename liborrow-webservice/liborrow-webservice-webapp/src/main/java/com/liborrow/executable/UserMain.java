package com.liborrow.executable;

import org.liborrow.webservice.model.dto.UserLightDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liborrow.webservice.business.contract.ManagerFactory;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ApplicationContext vApplicationContext
		        = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

				// Il est possible de récupérer un bean dans ce contexte :
				ManagerFactory vManagerFactory
		        = vApplicationContext.getBean("managerFactory", ManagerFactory.class);
				
				UserLightDTO user = vManagerFactory.getUserManager().login("test@gmail.com", "password");
				System.out.println(user.getFirstname());
	}

}
