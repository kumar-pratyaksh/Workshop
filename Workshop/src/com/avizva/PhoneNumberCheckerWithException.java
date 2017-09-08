package com.avizva;

import java.util.Scanner;

class NumberValidityException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9204574083646317760L;

	public NumberValidityException() {

	}

	public NumberValidityException(String msg) {
		super(msg);
	}
}

public class PhoneNumberCheckerWithException {

	static void checkValidity(String num) throws NumberValidityException {
		num = num.trim();
		if (num.length() != 10) {
			throw new NumberValidityException("Length less than 10");
		}
		char initialChar = num.charAt(0);
		if (!(initialChar == '7' || initialChar == '8' || initialChar == '9')) {
			throw new NumberValidityException("Initial digit not of 7|8|9");

		}

		for (char ch : num.toCharArray()) {
			if (!(ch >= '0' && ch <= '9')) {
				throw new NumberValidityException("Number contains non digit character");
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		String num = scanner.nextLine();
		try {
			checkValidity(num);
			System.out.println("Number valid");
		} catch (NumberValidityException e) {
			System.out.println("Number invalid");
			e.printStackTrace();
		}
		scanner.close();
	}
}
