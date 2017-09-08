package com.avizva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {

	static boolean isVowel(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			ch = (char) (ch + 32);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		return false;
	}

	static boolean isConsonent(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			ch = (char) (ch + 32);
		if (ch >= 'a' && ch <= 'z' && !isVowel(ch))
			return true;
		return false;
	}

	static boolean isDigit(char ch) {
		if (ch >= '0' && ch <= '9')
			return true;
		return false;
	}

	static boolean isBraces(char ch) {
		if (ch == '{' || ch == '}')
			return true;
		return false;
	}

	static void countCharacters(String s) {
		int vowels = 0, consonents = 0, digits = 0, braces = 0;
		for (char ch : s.toCharArray()) {
			if (isConsonent(ch))
				consonents++;
			else if (isVowel(ch)) {
				vowels++;
			} else if (isDigit(ch)) {
				digits++;
			} else if (isBraces(ch)) {
				braces++;
			}
		}
		System.out.println("Vowels:" + vowels);
		System.out.println("Consonents:" + consonents);
		System.out.println("Digits:" + digits);
		System.out.println("Braces:" + braces);
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String pathname = scanner.nextLine();
		String fileContent = new Scanner(new File(pathname)).useDelimiter("//Z").next();
		scanner.close();
		countCharacters(fileContent);
	}

}
