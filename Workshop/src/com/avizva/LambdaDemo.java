package com.avizva;

@FunctionalInterface
interface X321 {
	abstract void m1(String s);
}

public class LambdaDemo {

	public static void main(String[] args) {
		X321 obj = n -> {
			System.out.println("You called with " + n);
		};
		obj.m1("Hello World!!!");
	}
}
