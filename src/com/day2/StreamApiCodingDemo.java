package com.day2;

import java.util.Arrays;

public class StreamApiCodingDemo {
	public static void main(String[] args) {

		// to print element which contains 9 in it.
		// input: Integer Array = (10,15,8, 49, 25, 98,91,32,15)
		// output: 49,98,91
		System.out.println("Number containing digit 9: ");
		Integer[] array = { 10, 15, 8, 49, 25, 98, 91, 32, 15 };
		Arrays.stream(array).filter(n -> String.valueOf(n).contains("9")).forEach(n -> System.out.print(+n + ", "));

	}
}
