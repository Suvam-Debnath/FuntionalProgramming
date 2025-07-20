package com.suvam.Exercise1;

import java.util.List;

public class PrintCourses {
	public static void main(String args[]) {
		List<String> courses = List.of("spring","API","Microsrvices","AWS");
		courses.stream()
		.forEach(System.out::println);
	}
}
