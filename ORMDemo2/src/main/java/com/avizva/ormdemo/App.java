package com.avizva.ormdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.avizva.model.Address;
import com.avizva.model.Student;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Address address = new Address();
		address.setCity("MBD");
		address.setCountry("India");
		address.setPin(244001);
		Student student = new Student();
		student.setAddress(address);
		student.setName("KPemb");
		session.save(student);
		transaction.commit();
		session.close();
		factory.close();
	}
}
