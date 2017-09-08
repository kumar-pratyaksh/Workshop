package com.avizva;

interface DemoInterface {
	int x = 1000;

	void m1();
}

interface DemoInterface2 {
	void m2();
}

class Z implements DemoInterface, DemoInterface2 {
	public void m1() {
		System.out.println("Method 1");
	}

	@Override
	public void m2() {
		System.out.println("Method 2");
	}

}

public class InterfaceDemo {
	public static void main(String[] args) {
		Z z = new Z();
		z.m1();
		z.m2();
		DemoInterface demo1 = z;
		demo1.m1();
		DemoInterface2 demo2 = z;
		demo2.m2();
		System.out.println(DemoInterface.x);
	}
}
