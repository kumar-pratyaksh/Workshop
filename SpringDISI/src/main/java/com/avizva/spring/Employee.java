package com.avizva.spring;

public class Employee {

	private String name;
	private int age;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public Employee(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Employee() {
	}

	public Employee(int age) {
		this.age = age;
	}

	public Employee(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Name :" + this.name + " Age:" + this.age + " Address:" + this.address);
	}

}
