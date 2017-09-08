package com.avizva;

public class ComputeInitials {

	static String computeInitials(String name) {
		StringBuilder sBuilder = new StringBuilder();
		String[] nameArr = name.split(" ");
		for (String str : nameArr) {
			sBuilder.append(str.charAt(0));
		}
		return sBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println(computeInitials("Kumar Pratyaksh"));
	}

}
