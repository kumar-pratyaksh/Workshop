package com.avizva;

import java.util.Scanner;

public class AssertionDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age");
		int age = Integer.parseInt(scanner.nextLine());
		assert age > 18 : "Not eligible to vote";
		System.out.println("Eligible");

		scanner.close();
	}

}
