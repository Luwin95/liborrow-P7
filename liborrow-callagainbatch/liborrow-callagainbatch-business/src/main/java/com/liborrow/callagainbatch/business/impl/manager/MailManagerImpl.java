package com.liborrow.callagainbatch.business.impl.manager;

import java.util.List;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;

import org.springframework.mail.SimpleMailMessage;

import com.liborrow.callagainbatch.business.contract.manager.MailManager;
import com.liborrow.callagainbatch.business.impl.AbstractManagerImpl;
import com.liborrow.webinterface.generated.model.BorrowDTO;

public class MailManagerImpl extends AbstractManagerImpl implements MailManager {
	
	public void createAndSendMail(String email, List<String> borrows) {
		MimeMessage mimeMessage = getMailSender().createMimeMessage();
		try {
			mimeMessage.setFrom(new InternetAddress("b.aubin95@gmail.com", "nepasrepondre@liborrow.com"));

			mimeMessage.setRecipients(Message.RecipientType.TO,
		              InternetAddress.parse(email));
			mimeMessage.setSubject("[Liborrow] Retard de rendu de prêt");
			StringBuilder content = new StringBuilder();
			content.append(
					"<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n" + 
					"<head>\r\n" + 
					"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n" + 
					"    <title>Mail de confirmation</title>\r\n" + 
					"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n" + 
					"</head>\r\n" + 
					"<body style=\"margin: 0; padding: 0;\">\r\n" + 
					"<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n" + 
					"    <tr>\r\n" + 
					"        <table align=\"center\"  cellpadding=\"0\" cellspacing=\"0\" width=\"600\">\r\n" + 
					"            <tr>\r\n" + 
					"                <td align=\"center\" bgcolor=\"#307fff\" style=\"padding: 40px 0 30px 0; color: #E6E6E6;\">\r\n" + 
					"					<h1>Liborrow</h1>\r\n" + 
					"                </td>\r\n" + 
					"            </tr>\r\n" + 
					"            <tr>\r\n" + 
					"                <td bgcolor=\"#ffffff\" cellspacing=\"0\" style=\"padding: 40px 30px 40px 30px;\">\r\n" + 
					"                    <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n" + 
					"                        <tr>\r\n" + 
					"                            <td align=\"center\">\r\n" + 
					"                                <h1>Retour de prêt en retard</h1>\r\n" + 
					"\r\n" + 
					"                            </td>\r\n" + 
					"                        </tr>\r\n" + 
					"                        <tr>\r\n" + 
					"                            <td align=\"center\">\r\n" + 
					"                                <p>Bonjour ceci est un rappel concernant vos emprunts dans votre bibliothèque municipal .</p>\r\n" + 
					"\r\n" + 
					"                                <p>Les emprunts dans le tableau suivant doivent être rendu au plus vite ! Tant que ces livres ne seront pas rendu vous serez dans l'incapacité d'effectuer de nouveaux emprunts dans notre bibliothèque.</p>\r\n" + 
					"\r\n" + 
					"                            </td>\r\n" + 
					"                        </tr>\r\n" + 
					"                        <tr>\r\n" + 
					"                            <td align=\"center\">\r\n" + 
					"                                <table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n" + 
					"                                    <thead>\r\n" + 
					"                                        <tr bgcolor=\"#307fff\" style=\"color: #E6E6E6\">\r\n" + 
					"                                            <th>Titre</th>\r\n" + 
					"                                            <th>Type</th>\r\n" + 
					"                                        </tr>\r\n" + 
					"                                    </thead>\r\n" + 
					"                                    <tbody>\r\n" );
			
			for(String borrow : borrows)
			{ 
				content.append("<tr>\r\n");
				content.append("<td align=\"center\">"+borrow+"</td>\r\n");
				if(borrow.contains("°"))
				{
					content.append("<td align=\"center\">revue</td>\r\n");
				}else {
					content.append("<td align=\"center\">livre</td>\r\n");
				}
				content.append("</tr>\r\n");
			}
			
			content.append("                                    </tbody>\r\n" + 
					"                                </table>\r\n" + 
					"                            </td>\r\n" + 
					"                        </tr>\r\n" + 
					"						<tr>\r\n" + 
					"							<td align=\"center\"><p>Merci de votre compréhension et à bientôt dans votre bibliothèque !</p></td>\r\n" + 
					"						</tr>\r\n" + 
					"                    </table>\r\n" + 
					"                </td>\r\n" + 
					"            </tr>\r\n" + 
					"            <tr>\r\n" + 
					"                <td align=\"center\" bgcolor=\"#307fff\" style=\"color: #E6E6E6\">\r\n" + 
					"                    <p class=\"text-center\">Liborrow ©  | Développé par Ben's Company</p>\r\n" + 
					"                </td>\r\n" + 
					"            </tr>\r\n" + 
					"        </table>\r\n" + 
					"    </tr>\r\n" + 
					"</table>\r\n" + 
					"</body>\r\n" + 
					"</html>");
			mimeMessage.setContent(content.toString(), "text/html; charset=utf-8");
			getMailSender().send(mimeMessage);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setFrom("nepasrepondre@liborrow.com");
//		message.setTo(email);
//		message.setSubject("[Liborrow] Retard de rendu de prêt");
////		message.setContent("", "text/html; charset=utf-8");
//		message.setText("Test de mail");
	}
	
	public void sendTestMail() {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("b.aubin95@gmail.com");
		message.setTo("b.aubin@epmistes.net");
		message.setSubject("hello world");
		message.setText("hello world");
		getMailSender().send(message);
	}
}
