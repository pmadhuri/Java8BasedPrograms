package com.day1;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenOddNumberInList {
	// Write a Java program to calculate the sum of all even, odd numbers in a list
		// using streams.

		public static void main(String[] args) {

			List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 27, 7, 8, 9, 11, 15, 16);

			int evenSum = list.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();

			System.out.println("sum of even number is: " + evenSum);

			int oddSum = list.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();

			System.out.println();

			System.out.println("sum of odd number is: " + oddSum);
		}

	
}
