package com.avizva;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.avizva.model.Address;
import com.avizva.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Address address = new Address();
		address.setCity("MBD");
		address.setCountry("IN");
		address.setPin(244001);

		Address address2 = new Address();
		address2.setCity("GGN");
		address2.setCountry("IN");
		address2.setPin(122003);

		Employee employee = new Employee();
		employee.getAddress().add(address);
		employee.getAddress().add(address2);

		employee.setName("KP");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(employee);

		transaction.commit();
		session.close();
	}
}
