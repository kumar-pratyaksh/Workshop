package com.avizva.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8063246054970895580L;
	private int roll;
	private int age;
	private String name;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int roll, int age, String name) {
		super();
		this.roll = roll;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", age=" + age + ", name=" + name + "]";
	}

}

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fileOutputStream = new FileOutputStream("serialize.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		Student student = new Student(1, 23, "Kumar Pratyaksh");
		List<Student> list = new ArrayList<>();
		list.add(student);
		list.add(student);
		objectOutputStream.writeObject(list);
		FileInputStream fileInputStream = new FileInputStream("serialize.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Student student2;
		Object object;
		List<Student> readList = (List<Student>) objectInputStream.readObject();
		System.out.println(readList);
		objectInputStream.close();
		fileInputStream.close();
		objectOutputStream.close();
		fileOutputStream.close();

	}

}
