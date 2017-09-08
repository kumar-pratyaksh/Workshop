package com.avizva.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avizva.spring.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");

		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		System.out.println(employeeService.getEmployee().getName());
		System.out.println(Thread.currentThread().getName());

		employeeService.getEmployee().setName("kp1");

		employeeService.getEmployee().throwException();
	}
}
