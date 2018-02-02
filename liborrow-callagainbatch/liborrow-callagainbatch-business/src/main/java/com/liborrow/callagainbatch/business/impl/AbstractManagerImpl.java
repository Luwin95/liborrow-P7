package com.liborrow.callagainbatch.business.impl;

import org.springframework.mail.MailSender;

import com.liborrow.callagainbatch.consumer.contract.DaoFactory;

public class AbstractManagerImpl {
	private DaoFactory daoFactory;
	private MailSender mailSender;

	public DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	public MailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
}
