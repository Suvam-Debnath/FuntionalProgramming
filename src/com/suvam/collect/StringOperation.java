// create a list with length of all course titles

package com.suvam.collect;

import java.util.List;
import java.util.stream.Collectors;

public class StringOperation {
	public static void main(String args[]) {
		List<String> courses = List.of("Spring","API","Microsrvices","AWS","Spring Boot");
		List<Integer> new_course = courses.stream().map(x->x.length()).collect(Collectors.toList());
		System.out.println(new_course);
	}
	
}
