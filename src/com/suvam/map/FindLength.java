// Find the length of the courses

package com.suvam.map;

import java.util.List;

public class FindLength {
	public static void main(String args[]) {
		List<String> courses = List.of("Spring","API","Microsrvices","AWS","Spring Boot");
		courses.stream()
		.map(course -> course + "->"+course.length())
		.forEach(System.out::println);
	}
}
