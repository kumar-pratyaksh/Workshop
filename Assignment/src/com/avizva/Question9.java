package com.avizva;

import java.util.Arrays;

public class Question9 {

	static int removeDuplicates(int[] arr) {
		if (arr.length == 0 || arr.length == 1)
			return arr.length;
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				continue;
			}
			temp[j++] = arr[i];
		}
		temp[j++] = arr[arr.length - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}

		return j;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 7, 8, 9, 9 };
		Arrays.sort(arr);
		int newLen = removeDuplicates(arr);

		for (int i = 0; i < newLen; i++)
			System.out.println(arr[i] + " ");

	}

}
