package com.avizva;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.avizva.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction;

		// Employee employee = new Employee();
		// employee.setContact("742874624");
		// employee.setName("kp2");
		// employee.setSalary(5842765);
		// session.save(employee);

		// Criteria criteria = session.createCriteria(Employee.class);
		// // criteria.setFirstResult(2);
		// // criteria.setMaxResults(4);
		// // criteria.add(Restrictions.gt("id", 2));
		// criteria.addOrder(Order.desc("id"));
		// criteria.addOrder(Order.desc("name"));
		//
		// List<Employee> employees = (List<Employee>) criteria.list();
		// for (Iterator<Employee> iterator = employees.iterator();
		// iterator.hasNext();) {
		// Employee employee = iterator.next();
		// System.out.println(employee);
		// }
		// Employee1 employee1 = new Employee1();
		// employee1.setName("kp1");
		// employee1.setSalary(2500001);
		// session.save(employee1);

		// List<Employee1> list =
		// session.getNamedQuery("findEmployeeByName").setParameter("name",
		// "kp1").list();
		// System.out.println(list);
		//
		// Query query =
		// session.getNamedQuery("updateEmployee").setParameter("id",
		// 1).setParameter("name",
		// "Kumar Pratyaksh");
		// query.executeUpdate();

		Employee employee = new Employee();
		employee.setName("kp");

		Employee employee2 = new Employee();
		employee.setName("kp1");

		Employee employee3 = new Employee();
		employee.setName("kp2");
		transaction = session.beginTransaction();
		try {

			session.save(employee);
			session.save(employee2);
			throwException();
			session.save(employee3);
			transaction.commit();

		} catch (NullPointerException exception) {
			transaction.rollback();
		}
		session.close();
	}

	static void throwException() throws NullPointerException {
		throw new NullPointerException();
	}
}
