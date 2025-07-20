// sorted in alphabetical order

package com.suvam.sorted;

import java.util.Comparator;
import java.util.List;

public class SortStrings {
	public static void main(String args[]) {
		List<String> courses = List.of("Spring","API","Microsrvices","AWS","Spring Boot");
		courses.stream().sorted().forEach(System.out::println);
		System.out.println("-------------------");
		courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		System.out.println("-------------------");
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("---use langth of string to compare----");
		courses.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
		
	}
}
