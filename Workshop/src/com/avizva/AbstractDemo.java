package com.avizva;

abstract class Shape {
	abstract void area();

	abstract void m1();

	public Shape() {
		System.out.println("Inside super constructor");
	}
}

abstract class Circle extends Shape {

	@Override
	void area() {
		float r = 45;
		float ar = 3.14f * r * r;
		System.out.println("Area " + ar);
	}

}

class Square extends Shape {

	@Override
	void area() {
		float s = 4;
		float ar = s * s;
		System.out.println("Area Square " + ar);
	}

	void m1() {
	}

}

class X extends Circle {
	void m1() {
		System.out.println("Extended circle class");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		Square square = new Square();
		square.area();
		Circle circle = new X();
		circle.area();

	}
}
