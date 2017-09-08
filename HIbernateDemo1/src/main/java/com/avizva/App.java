package com.avizva;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.avizva.model.User;

/**
 * Hello world!
 *
 */
public class App {

	static Configuration configuration;

	static SessionFactory sessionFactory;

	static {
		configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
	}

	public static void main(String[] args) {
		User user = new User();
		user.setName("kp");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		user.setName("kpu");
		System.out.println(user.getId());
		transaction.commit();
		session.close();
		Session session2 = sessionFactory.openSession();
		System.out.println(session2.get(User.class, 2));
		session2.close();
		Session session3 = sessionFactory.openSession();
		System.out.println(session3.get(User.class, 2));
		session3.close();
	}

}
