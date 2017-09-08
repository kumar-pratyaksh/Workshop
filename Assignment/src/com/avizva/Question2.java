package com.avizva;

import java.util.Scanner;

public class Question2 {

	static int accountNumber = 1;

	static String getRandomAccNumber() {
		return "AC" + String.format("%08d", (int) (Math.random() * 100000000));
	}

	static String getNextAccountNumber() {
		return "AC" + String.format("%08d", accountNumber++);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("1-Random account number.");
			System.out.println("2-Next account number");
			System.out.println("3-Quit");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 1:
				System.out.println(getRandomAccNumber());
				break;
			case 2:
				System.out.println(getNextAccountNumber());
				break;
			default:
				flag = false;
				break;
			}
		}
		scanner.close();
	}

}
