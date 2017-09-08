package com.avizva.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.avizva.spring.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.avizva.spring.model");

		context.refresh();
		Employee employee = context.getBean(Employee.class);
		employee.setName("kp");
		System.out.println(employee);

		Employee employee2 = context.getBean(Employee.class);
		employee2.getAddress().setCity("MBD");
		System.out.println(employee2);

		context.close();
	}
}
