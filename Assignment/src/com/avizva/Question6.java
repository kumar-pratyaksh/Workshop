package com.avizva;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;

	public Student(int roll, String name, int age, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}

public class Question6 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "abc", 23, 100));
		students.add(new Student(2, "abc", 23, 101));
		students.add(new Student(3, "abc", 23, 102));
		students.add(new Student(4, "abc", 23, 103));
		students.add(new Student(5, "abc", 23, 104));
		students.add(new Student(6, "abc", 23, 105));
		students.add(new Student(7, "abc", 23, 106));
		students.add(new Student(8, "abc", 23, 107));
		students.add(new Student(9, "abc", 23, 108));
		List<Integer> marks = students.stream().map((s) -> s.getMarks()).collect(Collectors.toList());
		System.out.println("Marks list:" + marks);
		int total = marks.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Total:" + total);
	}

}
