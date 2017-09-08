package com.avizva.spring;

import java.util.Iterator;
import java.util.List;

public class Student {

	private String name;
	private int roll;
	private List<String> hobbies;
	private List<Address> addresses;

	public Student(String name, int roll, List<String> hobbies, List<Address> addresses) {
		super();
		this.name = name;
		this.roll = roll;
		this.hobbies = hobbies;
		this.addresses = addresses;
	}

	public Student(String name, int roll, List<String> hobbies) {
		super();
		this.name = name;
		this.roll = roll;
		this.hobbies = hobbies;
	}

	public Student() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void display() {
		System.out.println("Name :" + name);
		System.out.println("Roll number:" + roll);
		System.out.println("Hobbbies:");
		for (Iterator iterator = hobbies.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		if (addresses != null) {
			System.out.println("Address:");
			for (Address address : addresses) {
				System.out.println(address);
			}
		}
	}

}
