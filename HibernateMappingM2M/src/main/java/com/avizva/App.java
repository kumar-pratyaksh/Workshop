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
	public static void main(String[] args) {
		// Vehicle vehicle = new Vehicle();
		// vehicle.setName("PULSAR");
		// Vehicle vehicle2 = new Vehicle();
		// vehicle2.setName("Audi");
		// List<Vehicle> vehicles = new ArrayList<Vehicle>();
		// vehicles.add(vehicle);
		// vehicles.add(vehicle2);
		//
		// User user = new User();
		// user.setName("KP");
		// user.setContact(7417656401L);
		// user.setVehicle(vehicles);
		//
		// User user2 = new User();
		// user2.setName("KP2");
		// user2.setContact(74176564012L);
		// user2.setVehicle(vehicles);
		//
		// List<User> users = new ArrayList<User>();
		// users.add(user);
		// users.add(user2);
		//
		// vehicle.setUsers(users);
		// vehicle2.setUsers(users);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// session.save(user);
		// session.save(user2);
		// session.save(vehicle);
		// session.save(vehicle2);

		transaction.commit();
		User user2 = session.get(User.class, 2);
		// Vehicle vehicle3 = session.get(Vehicle.class, 3);
		// System.out.println(user2.getName());
		// System.out.println(vehicle3.getName());
		// System.out.println(user2);
		session.close();
		System.out.println(user2);
		// System.out.println(vehicle3.getUsers().getName());
		factory.close();
	}
}
