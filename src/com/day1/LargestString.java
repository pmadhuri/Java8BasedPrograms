package com.day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestString {
	public static void main(String[] args) {

		// 1. names with different length
		List<String> names = Arrays.asList("Bond", "Einstein", "Alice", "Whitman", "Bob", "Spider");

		// 1.1 print to console=
		System.out.println("Original String List :- \n" + names);

		// 2. find Longest name in List using max(Integer::compare).get()
		String longestString = names.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println("\nLongest String is = " + longestString);

		// 2.1 find Length of Longest name in List using max(Integer::compare).get()
		int lengthOflongestString = names.stream().map(String::length).max(Integer::compare).get();
		System.out.println("\nLength of Longest String is = " + lengthOflongestString);
	}
}
