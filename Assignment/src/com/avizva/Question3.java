package com.avizva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date in DD/MM/YYYY format:");
		String inputDate = scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate date = LocalDate.parse(inputDate, formatter);
		System.out.println("Entered date:" + date);
		System.out.println("Formatted date:" + date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
		scanner.close();
	}

}
