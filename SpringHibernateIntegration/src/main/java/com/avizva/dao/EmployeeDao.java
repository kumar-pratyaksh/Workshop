package com.avizva.dao;

import java.util.List;

import com.avizva.model.Employee;

public interface EmployeeDao {

	public boolean save(Employee employee);

	public boolean update(Employee employee);

	public boolean delete(Employee employee);

	public List<Employee> getAll();

	public Employee getOne(int id);

}
