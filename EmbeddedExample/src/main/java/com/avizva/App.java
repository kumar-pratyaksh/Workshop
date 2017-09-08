package com.avizva;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.avizva.model.Address;
import com.avizva.model.User;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Address homeAddress = new Address();
		homeAddress.setCity("MBD");
		homeAddress.setCountry("India");
		homeAddress.setPin(244001);

		Address officeAddress = new Address();
		officeAddress.setCity("GGN");
		officeAddress.setCountry("India");
		officeAddress.setPin(122003);

		List<Address> addresses = new ArrayList<Address>();
		addresses.add(officeAddress);
		addresses.add(homeAddress);
		User user = new User();
		user.setName("kp");
		user.setContact(7417656401L);
		user.setAddresses(addresses);
		// user.setHomeAddress(homeAddress);
		// user.setOfficeAddress(officeAddress);

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
