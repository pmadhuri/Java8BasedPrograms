package com.day1;

import java.util.Arrays;
import java.util.List;

public class FindTheMaximumAndMinimumValuesInALis {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 5, 45, 65, 35, 78, 1, 78, 25, 34);

		System.out.println("original list:" + list);

		Integer max = list.stream().max(Integer::compare).orElse(null);

		Integer min = list.stream().min(Integer::compare).orElse(null);

		System.out.println("Maximum number in the list is:" + max);

		System.out.println("minimum number in list is:" + min);

	}
}
