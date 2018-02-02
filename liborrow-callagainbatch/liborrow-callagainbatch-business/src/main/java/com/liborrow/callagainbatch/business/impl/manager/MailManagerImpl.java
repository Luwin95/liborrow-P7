package com.liborrow.callagainbatch.business.impl.manager;

import org.springframework.mail.SimpleMailMessage;

import com.liborrow.callagainbatch.business.contract.manager.MailManager;
import com.liborrow.callagainbatch.business.impl.AbstractManagerImpl;

public class MailManagerImpl extends AbstractManagerImpl implements MailManager {

	public void sendMail() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("b.aubin95@gmail.com");
		message.setTo("b.aubin@epmistes.net");
		message.setSubject("hello world");
		message.setText("hello world");
		getMailSender().send(message);
	}
}
