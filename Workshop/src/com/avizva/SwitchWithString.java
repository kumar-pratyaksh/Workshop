package com.avizva;

public class SwitchWithString {

	public static void main(String[] args) {

		String string = "hey";
		switch (string) {
		case "hey":
			System.out.println("You said hey");
			break;
		case "hello":
			System.out.println("You said hello");
			break;
		default:
			System.out.println("You did'nt say anything");
			break;
		}

	}

}
