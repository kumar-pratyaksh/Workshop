package com.avizva;

class ArrayLimitExcededException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3500272836101335958L;

	public ArrayLimitExcededException(String message) {
		super(message);
	}
}

class MyArray {

	int index;
	int data[];

	public MyArray() {
		index = -1;
		data = new int[50];
	}

	public void add(int num) throws ArrayLimitExcededException {
		if (++index == 20)
			throw new ArrayLimitExcededException("Maximum allowed size 20");
		data[index] = num;
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

public class Question7 {
	public static void main(String[] args) {
		MyArray myArray = new MyArray();
		for (int i = 0; i < 25; i++) {
			try {
				myArray.add(i);
				myArray.display();
			} catch (ArrayLimitExcededException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}
	}
}
