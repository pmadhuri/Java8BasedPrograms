package com.day1;

import java.util.Arrays;
import java.util.List;

public class SumOfElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Integer integer = list.stream().reduce((p, q) -> p + q).get();

		System.out.println(integer);

	}

}
