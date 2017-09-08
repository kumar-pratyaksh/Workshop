package com.avizva;

class Animal {

}

class Cat extends Animal {

	static void result(Animal a) {
		System.out.println(a instanceof Cat);
		if (a instanceof Cat) {
			System.out.println("Casting possible");
			Cat cat = (Cat) a;
			cat.display();
		} else {
			System.out.println("Casting not possible");
		}
	}

	void display() {
		System.out.println("Can call me");
	}

}

class Dog extends Animal {
}

public class DowncastingDemo {
	public static void main(String[] args) {
		Animal animal2 = new Dog();
		Animal animal = new Cat();
		Cat.result(animal2);
		Cat.result(animal);
	}
}
