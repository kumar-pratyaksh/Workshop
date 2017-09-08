package com.avizva.ormdemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.transform.Transformers;

import com.avizva.model.Student;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// Student student = new Student();
		// student.setName("KP");
		// student.setAddress("MBD");
		// session.save(student);

		// Query query = session.createQuery("from Student");
		// System.out.println(query.getReturnTypes());
		// System.out.println(query.list().toString());

		// Student student = new Student();
		// student.setRoll(5);
		// student.setName("kp23");
		// student.setAddress("GZB");
		// session.update(student);

		int roll = 6;
		// Query query = session.createQuery("select new
		// Student(roll,name,address) from Student");
		Query query = session.createQuery("select name as name, address as address from Student");
		// query.setParameter("roll", roll);
		// List<Object[]> list = query.list();
		// // students.forEach((s) -> System.out.println((Student) s));
		// list.forEach((s) -> {
		// System.out.println(s[0]);
		// System.out.println(s[1]);
		// });
		// query.setResultTransformer(Transformers.aliasToBean(Student.class));
		List<Student> list = query.setResultTransformer(Transformers.aliasToBean(Student.class)).list();
		list.forEach((s) -> {
			System.out.println(s);
		});
		transaction.commit();
		session.close();
		factory.close();
	}
}
