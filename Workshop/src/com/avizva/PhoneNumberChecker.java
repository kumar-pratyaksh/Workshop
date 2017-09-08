package com.avizva;

import java.util.Scanner;

public class PhoneNumberChecker {

	static boolean checkValidity(String num) {
		num = num.trim();
		if (num.length() != 10) {
			System.out.println("Length less then 10");
			return false;
		}
		char initialChar = num.charAt(0);
		if (!(initialChar == '7' || initialChar == '8' || initialChar == '9')) {
			System.out.println("Initial digit not of 7|8|9");
			return false;

		}

		for (char ch : num.toCharArray()) {
			if (!(ch >= '0' && ch <= '9')) {
				System.out.println("Number contains non digit character");
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		String num = scanner.nextLine();
		if (checkValidity(num)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		scanner.close();
	}

}
