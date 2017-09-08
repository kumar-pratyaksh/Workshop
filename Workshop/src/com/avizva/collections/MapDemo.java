package com.avizva.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Kumar");
		map.put(2, "Pratyaksh");
		map.put(0, "abc");
		System.out.println(map);
		Set<Map.Entry<Integer, String>> set2 = map.entrySet();
		for (Map.Entry<Integer, String> entry : set2) {
			System.out.println(entry);
		}
		// System.out.println(map.entrySet());
		Map<Integer, String> map2 = new TreeMap<>();
		map2.putAll(map);

		map2.put(-3, "Hello");
		System.out.println(map2);
		Map<Integer, String> map3 = new LinkedHashMap<>();
		map3.put(-1, "abc");
		map3.put(-4, "new");
		System.out.println(map3);
	}
}
