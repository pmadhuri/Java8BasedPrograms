package com.day1;

import java.util.Arrays;
import java.util.List;

public class FindTheSecondSmallestAndLargestElements {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 27, 7, 8, 9, 11, 15, 16);

		Integer secondSmallest = list.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		System.out.println("Second Smallest: " + secondSmallest);

		Integer secondLargest = list.stream().distinct().sorted(java.util.Collections.reverseOrder()).skip(1)
				.findFirst().orElse(null);
		System.out.println("Second Largest: " + secondLargest);
	}
}
