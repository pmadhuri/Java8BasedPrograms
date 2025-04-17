package com.day1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListConversion {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Vishnu");
		map.put(2, "ankush");
		map.put(3, "yogesh");
		map.put(4, "sagar");
		map.put(5, "mrunal");
		map.put(6, "pallavi");
		map.put(7, "pranali");
		map.put(8, "vishal");
		map.put(9, "sneha");

		List<Integer> list = map.keySet().stream().collect(Collectors.toList());
		System.out.println(list);

		System.out.println();

		List<String> list2 = map.values().stream().collect(Collectors.toList());
		System.out.println(list2);

	}
}
