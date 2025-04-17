package com.day1;

import java.util.Arrays;
import java.util.List;

public class NumberOfStringCountStartWith {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("vishnu", "yogesh", "suyog", "swami", "anna", "amol", "vaman", "vishal");

		char startingLetter = 'v';

		long count = str.stream().filter(s -> s.startsWith(String.valueOf(startingLetter))).count();

		System.out.println("number starting with char " + startingLetter + " is " + count);

	}
}
