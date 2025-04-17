package com.day1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfInteger {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 1, 1, 2, 2, 3, 4, 4, 4, 5, 4, 5, 6, 6, 2);
		Map<Integer, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);
	}
}
