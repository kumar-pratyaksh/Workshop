package com.avizva.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avizva.spring.dao.EmployeeDao;
import com.avizva.spring.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("databaseConfig.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId("1");
		employee.setName("kp1");
		employee.setDesignation("SDE2");

		// employeeDao.saveEmployee(employee);

		employee.setDesignation("Team Lead");
		// employeeDao.updateEmployee(employee);

		// employee.setId("1");
		// employeeDao.deleteEmployee(employee);

		List<Employee> employees = employeeDao.getAllEmployees();
		employees.forEach((e) -> System.out.println(e));

	}
}
