package com.avizva;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.avizva.model.Employee;
import com.avizva.model.PartTimeEmployee;
import com.avizva.model.RegularEmployee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("KP");
		employee.setContact("7417656401");

		RegularEmployee regularEmployee = new RegularEmployee();
		regularEmployee.setName("KPR");
		regularEmployee.setContact("743243");
		regularEmployee.setSalary(250000);
		regularEmployee.setBonus(5000000);

		PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
		partTimeEmployee.setName("KPP");
		partTimeEmployee.setContact("3453453453");
		partTimeEmployee.setContractPeriod(2);
		partTimeEmployee.setPayPerHour(5000);

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		session.save(regularEmployee);
		session.save(partTimeEmployee);
		transaction.commit();
		session.close();
	}
}
