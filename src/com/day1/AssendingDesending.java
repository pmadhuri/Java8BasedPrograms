package com.day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AssendingDesending {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 4, 7, 8, 9, 7, 2, 3, 4, 6);
		List<Integer> list2 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

		System.out.println("ascending order of given list " + list2);

		// Descending order

		List<Integer> list3 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Decending order of given list " + list3);

	}

}
