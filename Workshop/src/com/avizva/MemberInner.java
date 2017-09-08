package com.avizva;

import com.avizva.Outer.Inner;

class Outer {

	int x = 78;

	class Inner {
		void print() {
			System.out.println("Inside member inner class");
		}
	}

}

abstract class XY {
	abstract void m1();
}

class XYZ {
	static int x = 8;

	static class Y {
		void display() {
			System.out.println(x);
		}
	}
}

public class MemberInner {

	public static void main(String[] args) {

		Outer ob = new Outer();
		Inner inner = ob.new Inner();
		inner.print();

		XY obx = new XY() {

			@Override
			void m1() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous inner class");
			}

		};
		obx.m1();

		XYZ.Y y = new XYZ.Y();
		y.display();
	}

}
