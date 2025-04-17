package com.day1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

	public static void main(String[] args) {
		/*
		 * A suitable name for this program could be "WordCountJava8" or
		 * "WordFrequencyCounter". These names reflect the functionality of the program,
		 * making it clear that it counts the frequency of words in a given string using
		 * Java 8 features.
		 */

			String str = "Java is programming Java Programming Language";

			Map<String, Long> wordCount = Arrays.stream(str.toLowerCase().split("\\s+"))
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

			wordCount.forEach((word, count) -> System.out.println(word + " : " + count));

		}

	}