package com.liborrow.executable;

import java.util.List;

import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.utilsobject.UserCriterias;
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
				UserCriterias userCriterias = new UserCriterias();
				userCriterias.setEmail("test@gmail.com");
				List<UserLightDTO> users = vManagerFactory.getUserManager().searchUser(userCriterias);
				for (UserLightDTO user : users)	
				{
					System.out.println(user.getEmail()+" "+user.getFirstname());
				}
//				UserLightDTO user = vManagerFactory.getUserManager().login("test@gmail.com", "password");
//				System.out.println(user.getFirstname());
	}

}
