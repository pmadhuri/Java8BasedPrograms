package com.day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrangingStringInAssendingAndDesendingOrder {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("vishnu", "yogesh", "suyog", "swapnil", "shiva", "ravi", "waman");

		System.out.println("initial String list :" + list);
		List<String> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println("assending order of String list:" + collect);

		List<String> list2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println("decending order of string list:" + list2);

	}

}
