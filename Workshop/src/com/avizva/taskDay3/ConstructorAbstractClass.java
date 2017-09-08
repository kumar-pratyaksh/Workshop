package com.avizva.taskDay3;

abstract class DemoAbstractClass {
	public DemoAbstractClass() {
		System.out.println("Hello from abstract constructor!!!");
	}

	abstract void demoAbstractFunction();
}

class DemoConcreteClass extends DemoAbstractClass {

	public DemoConcreteClass() {
		System.out.println("Hello from concrete constructor!!!!");
	}

	@Override
	void demoAbstractFunction() {
		System.out.println("Hello from implementation of abstract function");
	}

}

public class ConstructorAbstractClass {
	public static void main(String[] args) {
		DemoAbstractClass obj = new DemoConcreteClass();
		obj.demoAbstractFunction();
	}

}
