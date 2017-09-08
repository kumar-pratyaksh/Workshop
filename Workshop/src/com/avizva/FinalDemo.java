package com.avizva;

class Parent {
	final void finalMethod() {
		System.out.println("This cant be overridden");
	}

	static void staticMethod() {
		System.out.println("This is  the static method of [arent");
	}
}

final class Child extends Parent {
	final int var = 324;

	void nonFinalMethod() {

		System.out.println("Parent calss" + var);
	}

}

public class FinalDemo {
	public static void main(String[] args) {
		Child parent = new Child();
		parent.finalMethod();
		parent.nonFinalMethod();
		Child.staticMethod();
	}
}
