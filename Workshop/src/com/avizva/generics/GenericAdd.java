package com.avizva.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericAdd {

	void add(List<? extends Number> list) {
		Integer total = 0;
		Double totalNumber = new Double(0);
		for (Number number : list) {
			totalNumber += number.doubleValue();
			Integer num = (Integer) number;
			total = total + num;
		}
		System.out.println(totalNumber);

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(4);
		new GenericAdd().add(list);
	}

	<T extends Number, V extends Number> void add(T num1, V num2) {
		System.out.println(num1.doubleValue() + num2.doubleValue());
	}

}
