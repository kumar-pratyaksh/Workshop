package com.avizva;

class A1 {
	A1 get() {
		return new A1();
	}
}

class B1 extends A1 {

	@Override
	B1 get() {
		return this;
	}

	void print() {
		System.out.println("Inside print");
	}
}

public class CoVariant {

	public static void main(String[] args) {
		new B1().get().print();
	}

}
