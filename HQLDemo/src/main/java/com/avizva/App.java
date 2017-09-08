package com.avizva;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.StandardBasicTypes;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		// List<User> users = session.createQuery("from User").list();
		// SQLQuery query = session.createSQLQuery("select * from
		// user1").addEntity("user", User.class);
		// query.addScalar("contact", StandardBasicTypes.LONG);
		// List<User> list = query.list();
		// users.forEach((user) -> {
		// System.out.println(user.getName());
		// System.out.println(user.getVehicle());
		// });
		// System.out.println(list);
		// list.forEach((user) -> {
		// System.out.println(user.getName());
		// System.out.println(user.getVehicle());
		// });

		// Query query = session.createQuery("delete from Vehicle where
		// id=:id");
		// query.setParameter("id", 3);
		// query.executeUpdate();

		long sum = (long) session.createQuery("select sum(id) as sum from User").list().get(0);
		System.out.println(sum);
		sum = (long) session.createSQLQuery("select max(id) as sum from user1")
				.addScalar("sum", StandardBasicTypes.LONG).list().get(0);
		System.out.println(sum);
		session.close();

	}
}
