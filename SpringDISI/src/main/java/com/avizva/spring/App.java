package com.avizva.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Employee employee = (Employee) context.getBean("employee");
		// employee.display();
		//
		// Employee employee2 = (Employee) context.getBean("employee2");
		// employee2.display();
		//
		// Student student = (Student) context.getBean("student");
		// student.display();
		//
		// Student student2 = (Student) context.getBean("student2");
		// student2.display();
		//
		// Question question = (Question) context.getBean("question");
		// question.display();

		Employee employee = (Employee) context.getBean("employee");
		employee.display();

		((ClassPathXmlApplicationContext) context).close();
	}
}
