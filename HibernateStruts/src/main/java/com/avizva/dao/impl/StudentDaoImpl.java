package com.avizva.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.avizva.dao.StudentDao;
import com.avizva.model.Student;

public class StudentDaoImpl implements StudentDao {

	static SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
	}

	private Session getSession() {
		return sessionFactory.openSession();
	}

	public boolean save(Student student) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		boolean flag = false;
		try {
			session.save(student);
			transaction.commit();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
		return flag;
	}

	public boolean update(Student student) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		boolean flag = true;
		try {
			session.update(student);
			flag = true;
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
		return flag;
	}

	public boolean delete(Student student) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		boolean flag = true;
		try {
			session.delete(student);
			flag = true;
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
		return flag;
	}

	public List<Student> getAll() {
		Session session = getSession();
		List<Student> students = session.createCriteria(Student.class).list();
		session.close();
		return students;
	}

	public Student get(String id) {
		Session session = getSession();
		Student student = session.get(Student.class, id);
		session.close();
		return student;
	}

}
