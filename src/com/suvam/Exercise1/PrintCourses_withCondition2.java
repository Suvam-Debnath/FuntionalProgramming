// Print courses whose name has atleast 4 letters

package com.suvam.Exercise1;

import java.util.List;

public class PrintCourses_withCondition2 {
	public static void main(String args[]) {
		List<String> courses = List.of("Spring","API","Microsrvices","AWS","Spring Boot");
		courses.stream()
		.filter(course -> course.length()>=4)
		.forEach(System.out::println);
	}
}
