package com.marketnew_app2.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendEmail(String to, String sub, String message) {
      SimpleMailMessage content = new SimpleMailMessage();
      content.setFrom("sanjayraj.raj08@gmail.com");
      content.setTo(to);
      content.setSubject(sub);
      content.setText(message);
      
      javaMailSender.send(content);
      System.out.println("the email is running");
      
    }
}
