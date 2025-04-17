package com.day1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConversionOfString {
	public static void main(String[] args) {
		String str = "Java is programming Java Programming Language";

		// Split the string into words, convert to Lowercase, and create a stream
		Map<String, Long> wordCount = Arrays.stream(str.toLowerCase().split("\\s+"))

				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Print the occurrences of each word
		wordCount.forEach((word, count) -> System.out.println(word + " : " + count));

	}
}
