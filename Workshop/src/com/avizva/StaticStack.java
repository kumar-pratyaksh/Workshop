package com.avizva;

public class StaticStack {

	int stack[] = new int[5];
	int top = -1;

	void push(int n) {
		if (top == 4) {
			System.out.println("Overflow");
			return;
		}
		stack[++top] = n;
	}

	void pop() {
		if (top == -1) {
			System.out.println("Underflow");
			return;
		}
		System.out.println("Poped:" + stack[top--]);
	}

	void display() {
		if(top==-1){
			System.out.println("Empty stack");
		}
		for (int i : stack) {
			System.out.println(i + " ");
		}
	}

}
