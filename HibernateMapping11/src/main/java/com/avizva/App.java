package com.avizva;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.avizva.model.User;
import com.avizva.model.Vehicle;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("PULSAR");
		User user = new User();
		user.setName("KP");
		user.setVehicle(vehicle);
		user.setContact(7417656401L);

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		transaction.commit();
		session.close();
		factory.close();
	}
}
