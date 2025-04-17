package com.day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxAndMin {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 4, 13, 23, 4, 5, 15, 6, 7, 8);

		List<Integer> setOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(setOrder);

		Integer integer = list.stream().max(Integer::compare).get();
		System.out.println("Maximum number from element :" + integer);

		// Find Minimum Number from List

		Integer integer2 = list.stream().min(Integer::compare).get();
		System.out.println("Minimum Number from List :" + integer2);

		// Sort Given Number in Natural Order

		Integer integer3 = list.stream().distinct().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
		System.out.println("Sorting natural Order :" + integer3);

		// Sort given Number In Decending Order

		Integer integer4 = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Sorting Reverse Order :" + integer4);

		List<String> list2 = Arrays.asList("amol", "bala", "danny", "ganesh", "hema");

		// Sorting String in Natural Order

		List<String> natSorting = list2.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorting Natural Order :" + natSorting);

		// Sorting String In reverse Order

		List<String> natString1 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sort String Reverse Order :" + natString1);

		// Find Longest String From List

		String maxString = list2.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println("Get largest length of String :" + maxString);

		// String Start with a is

		List<String> collect = list2.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
		System.out.println("String Start with a is :" + collect);

	}
}
