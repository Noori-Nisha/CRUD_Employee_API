package Spring_Emp_Serve.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component
public class SpringServeMailImple implements SpringServeMail {
	
	@Autowired
	private JavaMailSender sender;
	
	@Override
	public void SendEmpMail(String to, String sub, String text) {
		
		SimpleMailMessage s=new SimpleMailMessage();
		
		s.setTo(to);
		s.setSubject(sub);
		s.setText(text);
		
		sender.send(s);
	}

}
