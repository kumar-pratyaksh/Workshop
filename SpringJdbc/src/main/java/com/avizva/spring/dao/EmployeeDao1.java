package com.avizva.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;

import com.avizva.spring.model.Employee;

public class EmployeeDao1 {

	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Employee employee) {
		return template.update(
				new PreparedStatementCreatorFactory("insert into employees values(?,?,?)").newPreparedStatementCreator(
						new Object[] { employee.getId(), employee.getName(), employee.getDesignation() }));
	}

	public int saveEmployee(Employee employee) {
		String query = "insert into employees values(?,?,?)";
		return template.update(query, employee.getId(), employee.getName(), employee.getDesignation());
	}

}
