package com.avizva.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.avizva.model.Student;
import com.avizva.util.SessionUtil;

public class StudentDaoImpl implements StudentDao {

	public boolean saveStudent(Student s) {
		Session session = SessionUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(s);
			transaction.commit();
			session.close();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			session.close();
			return false;
		}

	}

	public boolean update(Student student) {
		Session session = SessionUtil.getSessionFactory().openSession();
		Query query = session.createQuery("update Student s set name=:name,contact=:contact where s.id=:id")
				.setParameter("name", student.getName()).setParameter("contact", student.getContact())
				.setParameter("id", student.getId());
		Transaction transaction = session.beginTransaction();
		boolean success = false;
		try {
			if (query.executeUpdate() > 0) {
				transaction.commit();
				success = true;
			}
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			session.close();
		}
		return success;
	}

	public boolean delete(int id) {
		Session session = SessionUtil.getSessionFactory().openSession();
		Query query = session.createQuery("delete from Student s where s.id=:id").setParameter("id", id);
		Transaction transaction = session.beginTransaction();
		boolean success = false;
		try {
			if (query.executeUpdate() > 0) {
				transaction.commit();
				success = true;
			}
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			session.close();
		}
		return success;
	}

	public Student fetch(int id) {
		Session session = SessionUtil.getSessionFactory().openSession();
		Student student = session.get(Student.class, id);
		session.close();
		return student;
	}

	public List<Student> fetchAll() {
		Session session = SessionUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> students = criteria.list();
		session.close();
		return students;
	}

	public List<Student> fetchByName(String name) {
		Session session = SessionUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Student.class);
		// criteria.add(new Crite)
		return null;
	}

}
