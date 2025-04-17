package com.day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithChar {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("vishnu", "yogesh", "suyog", "swami", "Anna");
		List<String> list = str.stream().filter(s -> s.startsWith("v")).collect(Collectors.toList());
		System.out.println("name Start with v is:" + list);

	}

}

