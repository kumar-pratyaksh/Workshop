package com.avizva;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokeniserDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name, Age and Salary of employee");
		String name;
		int age;
		double salary;
		String string = scanner.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(string, " ");
		name = tokenizer.nextToken();
		age = Integer.parseInt(tokenizer.nextToken());
		salary = Double.parseDouble(tokenizer.nextToken());
		Employee employee = new Employee(name, salary, age);
		employee.displayDetails();
		scanner.close();
	}

}
