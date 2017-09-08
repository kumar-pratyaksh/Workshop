package com.avizva.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.avizva.spring.model.Employee;

public class EmployeeDao {

	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int saveEmployee(Employee employee) {
		String query = "insert into employees values('" + employee.getId() + "','" + employee.getName() + "','"
				+ employee.getDesignation() + "')";
		return template.update(query);
	}

	public int updateEmployee(Employee employee) {
		String query = "update employees set name='" + employee.getName() + "',designation='"
				+ employee.getDesignation() + "' where id='" + employee.getId() + "'";
		return template.update(query);
	}

	public int deleteEmployee(Employee employee) {
		String query = "delete from employees where id='" + employee.getId() + "'";
		return template.update(query);
	}

	public List<Employee> getAllEmployees() {

		return template.query("select * from employees", new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> employees = new ArrayList<>();
				while (rs.next()) {
					Employee employee = new Employee();
					employee.setId(rs.getString(1));
					employee.setName(rs.getString(2));
					employee.setDesignation(rs.getString(3));
					employees.add(employee);
				}
				return employees;
			}

		});

	}

}

// return template.query("select * from employees", (rs) -> {
// List<Employee> employees = new ArrayList<>();
// while (rs.next()) {
// Employee employee = new Employee();
// employee.setId(rs.getString(1));
// employee.setName(rs.getString(2));
// employee.setDesignation(rs.getString(3));
// employees.add(employee);
// }
// return employees;
// });
