package com.day2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DulpicateElements {
	public static void main(String[] args) {

		// to print duplicate elements from an integer list
		List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 3, 2, 4, 1, 7, 6, 5,6);
		//output: Duplicate nos = [1, 2, 4, 6]
		Map<Integer, Long> collect = numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

		List<Integer> duplicateNumbers = collect.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey())
				.toList();
		System.out.println("Duplicate nos = " + duplicateNumbers);

	}
}
