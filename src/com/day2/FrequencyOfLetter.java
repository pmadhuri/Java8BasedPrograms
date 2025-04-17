package com.day2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfLetter {
	public static void main(String[] args) {
		// to count the frequency of each letter in a word.
		// input: "alpenlibe";
		// output: [a-1,l-2,p-1,e-2,n-1,i-1,b-1]

		String word = "alpenlibe";

		Map<Character, Long> collect = word.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect);
	}
}
