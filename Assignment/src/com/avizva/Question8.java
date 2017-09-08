package com.avizva;

class MyArray1 {

	int index;
	int data[];

	public MyArray1() {
		index = -1;
		data = new int[50];
	}

	public void add(int num) {
		assert index < 19 : "Array limit exceded";
		data[++index] = num;
	}

	public int remove() {
		if (index == -1) {
			System.out.println("Underflow");
			return -1;
		} else {
			return data[index--];
		}
	}

	public void display() {
		for (int i : data) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}

public class Question8 {
	public static void main(String[] args) {
		MyArray1 myArray = new MyArray1();
		for (int i = 0; i < 25; i++) {

			myArray.add(i);
			myArray.display();

		}
	}
}
