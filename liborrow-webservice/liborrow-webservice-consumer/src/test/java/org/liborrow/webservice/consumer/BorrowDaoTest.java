package org.liborrow.webservice.consumer;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.liborrow.webservice.consumer.contract.DaoFactory;
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

}
