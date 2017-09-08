package com.avizva;

public class StackDemo {

	public static void main(String[] args) {
		StaticStack stack = new StaticStack();
		stack.push(5);
		stack.push(2);
		stack.display();
		stack.pop();
		stack.pop();
		stack.pop();
		DynamicStack stack2 = new DynamicStack();
		stack2.push(5);
		stack2.push(7);
		stack2.display();
		stack2.pop();
		stack2.display();
		stack2.pop();
		stack2.display();
	}

}
