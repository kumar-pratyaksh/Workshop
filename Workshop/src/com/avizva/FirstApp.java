package com.avizva;

class HelperClass {
	static int x = 8, y = 9;
	int a = 6, b = 4;

	static void f1() {
		System.out.println("Static function");
		System.out.println(x + y);
		HelperClass ob = new HelperClass();
		System.out.println(ob.a + ob.b);
	}

	void f2() {
		System.out.println("in F2");
		System.out.println(x + y);
		System.out.println(a + b);
	}

}

class HelperClass1 {
	int x = 8;

	public HelperClass1() {
		this(10);
		System.out.println("Default Constructor");

	}

	public HelperClass1(int x) {
		System.out.println("Parametrized Constructor");
		this.x = x;
	}

	public void display() {
		System.out.println(x);
	}
}

class Address {
	String city, country;
	int pin;

	public Address(String city, String country, int pin) {
		this.city = city;
		this.pin = pin;
		this.country = country;
	}

	@Override
	public String toString() {
		return "City = " + city + " Pin = " + pin + " Country " + country;
	}

}

class Student {
	String name;
	int age;
	Address address;

	public Student(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Name = " + name + ", Age = " + age + ", Address = " + address;
	}

}

public class FirstApp {

	public static void main(String[] args) {
		System.out.println("First Code");
		new HelperClass().f2();
		HelperClass.f1();
		new HelperClass1().display();
		new HelperClass1(45).display();

		Address address = new Address("Moradabad", "India", 244001);
		Student student = new Student("Kumar Pratyaksh", 23, address);
		System.out.println(student);
	}
}
