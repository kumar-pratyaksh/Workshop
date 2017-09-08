package com.avizva.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(4);
		vector.add(3);
		vector.add(5);

		Enumeration<Integer> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			Integer integer = enumeration.nextElement();
			System.out.println(integer);
		}

		Iterator<Integer> iterator = vector.iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			System.out.println(integer);

		}

	}
}
