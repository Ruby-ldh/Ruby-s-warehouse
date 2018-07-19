package hst.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/** 
* @author Ruby E-mail: 1104471752@qq.com
* @version 创建时间：2018年7月9日 下午1:41:51 
* 类说明 
*/
public class EmailDemo{
	
	
	public static void sendMail(MessageVo mv ){
		 
        final String username = "hsterp3@hstscale.com";
        final String password = "Hst12345";
        boolean isSSL = true;
        String host = "smtp.mxhichina.com";
        int port = 465;
        boolean isAuth = true;
 
 
        String from = "hsterp3@hstscale.com";
 
 
        Properties props = new Properties();
        props.put("mail.smtp.ssl.enable", isSSL);
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.auth", isAuth);
 
        Session session = Session.getDefaultInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
 
        try {
            Message message = new MimeMessage(session);
 
            message.setFrom(new InternetAddress(from));
            message.setSubject(mv.getSubject());
            message.setText(mv.getText());
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(mv.getToMailAddress()));
 
 
            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        System.out.println("发送完毕！");
    }

	
	
	}
