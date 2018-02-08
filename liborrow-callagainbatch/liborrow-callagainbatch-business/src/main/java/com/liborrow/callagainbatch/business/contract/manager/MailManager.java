package com.liborrow.callagainbatch.business.contract.manager;

import java.util.List;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.liborrow.webinterface.generated.model.BorrowDTO;

public interface MailManager {
	void sendTestMail();
	void createAndSendMail(String email, List<String> borrows);
}
