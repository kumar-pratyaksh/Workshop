package com.avizva;

import java.io.IOException;

public class RuntimeClassDemo {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("PROCESSORS AVAILABLE:" + runtime.availableProcessors());
		System.out.println("FREE MEMORY AVAILABLE:" + runtime.freeMemory());
		System.out.println("MAX MEMORY AVAILABLE:" + runtime.maxMemory());
		try {
			System.out.println(runtime.exec("ls").getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
