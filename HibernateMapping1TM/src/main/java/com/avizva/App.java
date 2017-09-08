package com.avizva;

import java.util.ArrayList;
import java.util.List;

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
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setName("Audi");
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(vehicle);
		vehicles.add(vehicle2);

		User user = new User();
		user.setName("KP");
		user.setContact(7417656401L);
		user.setVehicle(vehicles);

		vehicle.setUsers(user);
		vehicle2.setUsers(user);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// session.save(user);
		// session.save(vehicle);
		// session.save(vehicle2);

		transaction.commit();
		User user2 = session.get(User.class, 2);
		Vehicle vehicle3 = session.get(Vehicle.class, 9);
		System.out.println(user2.getName());
		System.out.println(vehicle3.getName());
		// System.out.println(user2);
		session.close();
		// System.out.println(user2.getVehicle());
		System.out.println(vehicle3.getUsers().getName());
		factory.close();
	}
}
