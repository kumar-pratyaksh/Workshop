package com.avizva;

public class CountNumberOfOccurenceOfCharacter {

	int method1(String s, char ch) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch)
				count++;
		}
		return count;
	}

	int method2(String s, char ch) {
		return s.length() - s.replace(ch + "", "").length();
	}

	public static void main(String[] args) {
		CountNumberOfOccurenceOfCharacter count = new CountNumberOfOccurenceOfCharacter();
		System.out.println(count.method2("Hello how are you", 'o'));
		System.out.println(count.method1("Hello how are you", 'o'));
	}

}
