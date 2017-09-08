package com.avizva.generics;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Inside Circle draw");
	}

	void drawChild() {
		System.out.println("Circle child draw");
	}

}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("inside Rectangle Draw");
	}

	void drawChild() {
		System.out.println("Rectangle child draw");
	}

}

public class WildcardsDemo {

	static public void useDrawMethod(List<? extends Shape> list) {
		for (Shape shape : list) {
			shape.draw();
		}
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle circle1 = new Circle();

		List<Circle> listCircle = new ArrayList<>();
		listCircle.add(circle);
		listCircle.add(circle1);
		useDrawMethod(listCircle);

		Rectangle rectangle = new Rectangle();
		Rectangle rectangle1 = new Rectangle();
		List<Rectangle> listRectangle = new ArrayList<>();
		listRectangle.add(rectangle);
		listRectangle.add(rectangle1);
		useDrawMethod(listRectangle);

	}

}
