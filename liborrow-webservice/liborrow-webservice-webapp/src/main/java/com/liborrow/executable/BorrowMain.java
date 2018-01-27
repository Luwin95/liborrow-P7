package com.liborrow.executable;

import java.util.List;

import org.liborrow.webservice.model.dto.BorrowDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liborrow.webservice.business.contract.ManagerFactory;

public class BorrowMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext vApplicationContext
		= new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

		// Il est possible de récupérer un bean dans ce contexte :
		ManagerFactory vManagerFactory
	    = vApplicationContext.getBean("managerFactory", ManagerFactory.class);
		
		List<BorrowDTO> borrowsDTO = vManagerFactory.getBorrowManager().findAllBorrows();
		for(BorrowDTO borrow : borrowsDTO)
		{
			System.out.println(borrow.getId());
			if(borrow.getId()==5)
			{
				vManagerFactory.getBorrowManager().markAsExtended(borrow);
			}
		}
	}		
}
