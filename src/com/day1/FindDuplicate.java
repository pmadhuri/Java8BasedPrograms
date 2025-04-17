package com.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 12, 10, 15, 14, 14, 12, 17, 18, 19, 19, 19, 19,12);
		Set<Integer> set = new HashSet<>();

		List<Integer> duplicateElement = list.stream().filter(e -> !set.add(e)).collect(Collectors.toList());

		System.out.println(duplicateElement);

	}

}
