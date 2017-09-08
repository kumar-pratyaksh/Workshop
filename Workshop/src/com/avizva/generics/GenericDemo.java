package com.avizva.generics;

class Gen<T> {
	T a;

	public Gen(T a) {
		this.a = a;
	}

	T getValue() {
		return a;
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		Gen<String> sGen = new Gen<String>("Hello");
		System.out.println(sGen.getValue());

		Gen<Integer> sGen1 = new Gen<Integer>(24);
		System.out.println(sGen1.getValue());

	}

}
