package com.day2;

import java.util.Arrays;
import java.util.List;

public class AverageOfInteger {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 5, 6, 7, 8, 9);

		System.out.println(" list of number:" + list);

		double avg = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println("averge of given number is: " + avg);
	}

}
