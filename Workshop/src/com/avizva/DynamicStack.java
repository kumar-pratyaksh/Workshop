package com.avizva;

import java.util.ArrayList;
import java.util.List;

public class DynamicStack {
	List<Integer> stack = new ArrayList<>();

	void push(int n) {
		stack.add(n);
	}

	void pop() {
		if (stack.size() == 0) {
			System.out.println("Underflow");
			return;
		}
		System.out.println("Popped:" + stack.remove(stack.size() - 1));
	}

	void display() {
		if (stack.size() == 0) {
			System.out.println("Empty stack");
		}
		for (Integer integer : stack) {
			System.out.println(integer + " ");
		}
	}

}
