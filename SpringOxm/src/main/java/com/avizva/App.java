package com.avizva;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;

import com.avizva.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Marshaller marshaller = (Marshaller) applicationContext.getBean("jaxbMarshallerBean");
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("KP");
		employee.setSalary(23423.09234);

		try {
			marshaller.marshal(employee, new StreamResult(new FileWriter("employee.xml")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("XML created successfully");

	}
}
