package com.avizva;

import java.util.Scanner;

public class Employee {

	// We make the attribute private and methods public

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

	private String name;
	private double salary;
	private int age;

	public Employee(String name, double salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public Employee() {
	}

	public void displayDetails() {
		System.out.println(this.name + " " + this.salary + " " + this.age);
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name:");
		this.name = scanner.nextLine();
		System.out.print("Enter designation:");
		this.salary = scanner.nextDouble();
		System.out.print("Enter age:");
		this.age = scanner.nextInt();
		scanner.close();
	}

}