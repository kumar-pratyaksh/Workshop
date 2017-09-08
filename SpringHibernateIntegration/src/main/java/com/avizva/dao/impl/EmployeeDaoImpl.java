package com.avizva.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.avizva.dao.EmployeeDao;
import com.avizva.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Transactional
	public boolean save(Employee employee) {
		Session session = getSession();
		LOGGER.info("Saving employee data");
		// Transaction transaction = session.beginTransaction();
		boolean flag = true;
		// try {
		// session.save(employee);
		// flag = true;
		// transaction.commit();
		// LOGGER.info("Employee details saved sucesfully");
		// } catch (Exception e) {
		// LOGGER.error("Failed to save employee details");
		// e.printStackTrace();
		// transaction.rollback();
		// } finally {
		// session.close();
		// }
		session.save(employee);
		return flag;
	}

	@Transactional
	public boolean update(Employee employee) {
		Session session = getSession();
		// Transaction transaction = session.beginTransaction();
		boolean flag = true;
		// try {
		// session.update(employee);
		// flag = true;
		// transaction.commit();
		// } catch (Exception e) {
		// e.printStackTrace();
		// transaction.rollback();
		// } finally {
		// session.close();
		// }
		session.update(employee);
		return flag;
	}

	@Transactional
	public boolean delete(Employee employee) {
		Session session = getSession();
		// Transaction transaction = session.beginTransaction();
		boolean flag = true;
		// try {
		// session.delete(employee);
		// flag = true;
		// transaction.commit();
		// } catch (Exception e) {
		// e.printStackTrace();
		// transaction.rollback();
		// } finally {
		// session.close();
		// }
		session.delete(employee);
		return flag;
	}

	@Transactional
	public List<Employee> getAll() {

		Session session = getSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.list();
		return list;
	}

	@Transactional
	public Employee getOne(int id) {
		Session session = getSession();
		Employee employee = session.get(Employee.class, id);
		return employee;
	}

}
