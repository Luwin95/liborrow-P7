package com.liborrow.callagainbatch.business.contract.manager;

import java.util.List;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.utils.enums.MailTypeEnum;

public interface MailManager {
	void sendTestMail();
	void createAndSendMail(String email, List<String> objects, MailTypeEnum type);
}
