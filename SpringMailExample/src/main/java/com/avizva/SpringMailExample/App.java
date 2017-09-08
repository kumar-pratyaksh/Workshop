package com.avizva.SpringMailExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avizva.Mail;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Mail mail = (Mail) context.getBean("mail");
		mail.sendMail("kumar.pratyaksh93@gmail.com", "pratyaksh.kumar@avizva.com", "Test Mail", "Hello from java!!!");
		System.out.println("Mail sent.");
	}
}
