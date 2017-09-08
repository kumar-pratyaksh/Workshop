package com.avizva.io;

import java.io.DataInputStream;
import java.io.IOException;

import com.avizva.Employee;

public class InputDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		DataInputStream dataInputStream = new DataInputStream(System.in);
		String name;
		int age;
		double salary;
		System.out.println("Enter name");
		name = dataInputStream.readLine();
		age = Integer.parseInt(dataInputStream.readLine());
		salary = Double.parseDouble(dataInputStream.readLine());
		Employee employee = new Employee(name, salary, age);
		System.out.println(employee);
		System.out.println(dataInputStream.readInt());

	}

}
