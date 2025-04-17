package com.day2;

import java.util.Arrays;
import java.util.List;

public class AscendingOrder {
	public static void main(String[] args) {

		// How to arrange string in ascending order of length using Stream Api
		// input: String s = "Java is a wonderful language"
		// output = ["a, is, java, language,wonderful"]

		String s = "Java is  a wonderful language";

		List<String> sortedWordsByLength = Arrays.stream(s.split("\\s+"))
				// .sorted(Comparator.comparingInt(String:: length))
				.sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).toList();

		System.out.println(sortedWordsByLength);

	}
}
