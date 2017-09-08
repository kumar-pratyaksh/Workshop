package com.avizva.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avizva.model.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	Employee employee;

	public Employee getDetail(int id) {
		employee.setName("kp");
		employee.setSalary(230000D);
		employee.setId(id);
		return employee;
	}

}
