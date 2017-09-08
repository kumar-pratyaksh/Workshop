package com.avizva.collections;

import java.util.Arrays;

public class Test {

	public String names[] = { "Kumar", "Pratyaksh" };

	public String[] getNames() {
		return names.clone();
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Test [names=" + Arrays.toString(names) + "]";
	}

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.names.toString());
		System.out.println(test);
		String[] demo = test.getNames();
		demo[0] = "No way";
		System.out.println(test.names);
		System.out.println(test);
	}

}
