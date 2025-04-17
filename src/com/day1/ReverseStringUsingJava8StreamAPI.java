package com.day1;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseStringUsingJava8StreamAPI {
	 public static void main(String[] args) {  
	        Scanner scanner = new Scanner(System.in);  
	        System.out.print("Enter a string: ");  
	        String originalString = scanner.nextLine();  
	        scanner.close();  
	        IntStream charStream = originalString.chars();  
	        Stream<String> charStringStream = charStream.mapToObj(ch -> String.valueOf((char) ch));  
	        String reversedString = charStringStream.reduce((acc, ch) -> ch + acc).orElse("");  
	        System.out.println("Reversed string: " + reversedString);  
	    }  
}
