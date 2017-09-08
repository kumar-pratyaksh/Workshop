package com.avizva.taskDay3;

class Class1 {

	void dispaly() {
		System.out.println("Class 1 display function");
	}

}

class Class2 {

	void dispaly() {
		System.out.println("Class 1 display function");
	}

}

class Util {

	static void callDisplayFunction(Object obj) {
		if (obj instanceof Class1) {
			((Class1) obj).dispaly();
		} else if (obj instanceof Class2) {
			((Class2) obj).dispaly();
		} else {
			System.out.println("Unsopported Class");
		}

	}

}

public class UpcastingDownCastingDemo {

	public static void main(String[] args) {
		Util.callDisplayFunction(new Class1());
		Util.callDisplayFunction(new Class2());
		Util.callDisplayFunction(new String());
	}

}
