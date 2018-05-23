package org.liborrow.webservice.consumer;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.liborrow.webservice.consumer.contract.DaoFactory;
import org.liborrow.webservice.model.entities.Borrow;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BorrowDaoTest {
	private static final Logger LOGGER = LogManager.getLogger(WaitingListDaoTest.class);
	private static ApplicationContext springContext;
	private static DaoFactory daoFactory;
	
	@BeforeAll
	public static void SpringInitialization() {
		springContext = new ClassPathXmlApplicationContext("classpath:/org/liborrow/webservice/consumer/bootstrapContext.xml");
		daoFactory = (DaoFactory) springContext.getBean("daoFactory");
	}
	
	@Test
	public void checkItemForUser() {
		LOGGER.debug("[DEBUT] SpringRegistry() - Initialisation du contexte Spring");
		boolean isInUserList = daoFactory.getBorrowDao().checkItemForUser(5L, 3L);
		assertTrue(isInUserList);
	}
	
	@Test
	public void remindBorrowsTest() {
		LOGGER.debug("[DEBUT] remindBorrowsTest() - Début du test");
		List<Borrow> borrowsToRemind = daoFactory.getBorrowDao().remindBorrows();
		assertNotNull(borrowsToRemind);
		assertTrue(borrowsToRemind.size()>0);
		assertTrue(borrowsToRemind.size()==1);
		assertTrue(borrowsToRemind.get(0).getId() ==15);
	}

}
