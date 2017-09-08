package com.avizva;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		str = str.toLowerCase();
		int vowels = 0, consonants = 0, digits = 0;
		for (char c : str.toCharArray()) {

			if (c >= '0' && c <= '9') {
				digits++;
			} else if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u')
					vowels++;
				else
					consonants++;
			}

		}
		System.out.println("Digits " + digits);
		System.out.println("Vowels " + vowels);
		System.out.println("Consonents " + consonants);
		scanner.close();
	}
}
