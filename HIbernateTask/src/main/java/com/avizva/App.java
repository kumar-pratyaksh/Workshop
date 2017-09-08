package com.avizva;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.avizva.model.User;
import com.avizva.model.UserDetail;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		UserDetail userDetail = new UserDetail();
		userDetail.setPassword("12345");
		userDetail.setUsername("KP");

		User user = new User();
		user.setContact(7417656401L);
		user.setUserDetail(userDetail);
		user.setName("Kumar Pratyaksh");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		factory.close();
	}
}
