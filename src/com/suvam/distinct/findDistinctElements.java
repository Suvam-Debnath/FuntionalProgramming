package com.suvam.distinct;

import java.util.List;

public class findDistinctElements {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(1, 2, 3,1,3,9, 7, 8, 9, 10);
		Dis(numbers);
	}
	private static void Dis(List<Integer> numbers) {
        numbers.stream().distinct().forEach(System.out::println);;
        
    }
}
