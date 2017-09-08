package com.avizva.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.avizva.Employee;

public class CollectionInterfaceMethodsDemo {
	public static void main(String[] args) {
		ArrayList<Employee> a1 = new ArrayList<>();
		a1.add(new Employee("a", 2000000, 23));
		a1.add(new Employee("KP1", 2400000, 23));
		System.out.println(a1);
		Iterator<Employee> iterator = a1.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
	}
}
