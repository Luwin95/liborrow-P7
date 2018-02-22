package com.liborrow.executable;

import java.util.List;

import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.dto.UserLightDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liborrow.webservice.business.contract.ManagerFactory;
import com.liborrow.webservice.services.BorrowService;

public class BorrowMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext vApplicationContext
		= new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

		// Il est possible de récupérer un bean dans ce contexte :
		ManagerFactory vManagerFactory
	    = vApplicationContext.getBean("managerFactory", ManagerFactory.class);
		
//		UserLightDTO user = vManagerFactory.getUserManager().findById(1);
		BorrowService borrowService = new BorrowService();
//		List<BorrowDTO> borrowsDTO = borrowService.findLateBorrows();
////		List<BorrowDTO> borrowsDTO = vManagerFactory.getBorrowManager().findLateBorrows();
//		
//		for(BorrowDTO borrow : borrowsDTO)
//		{
//			System.out.println(borrow.getId());
//			System.out.println(borrow.getStartDate().getDate()+"/"+borrow.getStartDate().getMonth()+"/"+borrow.getStartDate().getYear());
//			if(borrow.getId()==5)
//			{
//				vManagerFactory.getBorrowManager().markAsExtended(borrow);
//			}
//		}
		
		BorrowDTO test =  borrowService.getBorrow(8);
	}		
}
