// Print courses which starts with Spring

package com.suvam.Exercise1;

import java.util.List;

public class PrintCourse_withCondition {
	public static void main(String args[]) {
		List<String> courses = List.of("Spring","API","Microsrvices","AWS","Spring Boot");
		courses.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(System.out::println);
	}
}
