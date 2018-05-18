package org.liborrow.webservice.consumer;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.liborrow.webservice.consumer.contract.DaoFactory;
import org.liborrow.webservice.model.entities.WaitingList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class WaitingListDaoTest {
	private static final Logger LOGGER = LogManager.getLogger(WaitingListDaoTest.class);
	private static ApplicationContext springContext;
	private static DaoFactory daoFactory;
	
	@BeforeAll
	public static void SpringInitialization() {
		springContext = new ClassPathXmlApplicationContext("classpath:/org/liborrow/webservice/consumer/bootstrapContext.xml");
		daoFactory = (DaoFactory) springContext.getBean("daoFactory");
	}
	
	@Test
	public void getWaitingListSizeTest() {
		LOGGER.debug("[DEBUT] getWaitingListSizeTest() - Démarrage du test");
		Long waitingListSize = daoFactory.getWaitingListDao().getWaitingListSize(5L);
		assertTrue(waitingListSize==0);
		assertFalse(waitingListSize.intValue()>=2);
	}
	
	@Test
	public void getLastPositionTest() {
		LOGGER.debug("[DEBUT] getLastPositionTest() - Démarrage du test");
		Integer lastPosition = daoFactory.getWaitingListDao().getLastPosition(6L);
		assertNotNull(lastPosition);
		assertTrue(lastPosition==1);
	}
	
	@Test
	public void checkItemInUserWaitingListTest() {
		LOGGER.debug("[DEBUT] checkItemInUserWaitingList() - Démarrage du test");
		assertTrue(daoFactory.getWaitingListDao().checkItemInUserWaitingList(6L, 3L));
		
	}
	
	@Test
	public void getWaitingListByBorrowerTest() {
		LOGGER.debug("[DEBUT] getWaitingListByBorrower() - Démarrage du test");
		List<WaitingList> userWaitingList = daoFactory.getWaitingListDao().getWaitingListByBorrower(3L);
		assertNotNull(userWaitingList);
		assertTrue(userWaitingList.size() == 1);
	}
	
	@Test
	@Transactional
	public void removeItemInUserWaitingListTest() {
		LOGGER.debug("[DEBUT] removeItemInUserWaitingListTest() - Démarrage du test");
		 daoFactory.getWaitingListDao().removeItemInUserWaitingList(6L, 1L);
		 assertTrue(true);
	}
}
