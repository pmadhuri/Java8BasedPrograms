package com.day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 5, 6, 4, 7, 8, 9, 2, 4, 5, 6, 1, 2, 4);

		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());

		System.out.println(list2);

	}

}
