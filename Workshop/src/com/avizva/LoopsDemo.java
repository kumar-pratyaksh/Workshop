package com.avizva;

public class LoopsDemo {

	static void forLoopDesign(int choice) {
		switch (choice) {
		case 1:
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++)
					System.out.print("* ");
				System.out.println();
			}
			break;
		case 2:
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++)
					System.out.print(j + " ");
				System.out.println();
			}
			break;
		default:
			System.out.println("Incorrect choice");
			break;
		}
	}

	static void whileLoopDemo(int choice) {
		if (choice == 1) {
			int i = 5;
			while (i > 0) {
				int j = i;
				while (j > 0) {
					System.out.print("* ");
					j--;
				}
				System.out.println();
				i--;
			}
		} else if (choice == 2) {
			int i = 5;
			while (i > 0) {
				int j = i;
				while (j > 0) {
					System.out.print(j + " ");
					j--;
				}
				System.out.println();
				i--;
			}
		} else {
			System.out.println("Incorrect choice");
		}
	}

	static void doWhileLoopDemo() {
		int i = 5;
		do {
			int j = 1;
			do {
				System.out.print(j + " ");
				j++;
			} while (j <= i);
			System.out.println();
			i--;
		} while (i >= 1);
	}

	static void forEachLoopDemo() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 10;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("-----Loops Demo-----");
		System.out.println("For Loop");
		System.out.println();
		forLoopDesign(1);
		System.out.println();
		forLoopDesign(2);
		System.out.println();
		forLoopDesign(3);
		System.out.println();
		System.out.println("While Loop");
		System.out.println();
		whileLoopDemo(1);
		System.out.println();
		whileLoopDemo(2);
		System.out.println();
		whileLoopDemo(3);
		System.out.println();
		System.out.println("D While Loop");
		System.out.println();
		doWhileLoopDemo();
		System.out.println();
		System.out.println("Enhanced For Loop");
		System.out.println();
		forEachLoopDemo();
	}

}
