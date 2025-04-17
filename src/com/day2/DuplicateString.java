package com.day2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateString {

	
	public static void main(String[] args) {

		// WAP using stream api to count the repetition of the words in
		// String s = "welcome to bikkadit and bikkadit welcome you"
		// output: -and : 1 -to : 1 -bikkadit : 2 -welcome : 2 -you : 1
		String s = "welcome to bikkadit and bikkadit welcome you";
		Map<String, Long> wordCount = Arrays.stream(s.split("\\s+"))
				// .collect(Collectors.groupingBy(word->word,Collectors.counting()));
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		wordCount.forEach((word, count) -> System.out.print(" -" + word + " : " + count));
	}
}
