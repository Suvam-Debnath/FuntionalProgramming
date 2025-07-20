package com.suvam.sorted;

import java.util.List;

public class SortNums {
	public static void main(String args[]) {
		List<Integer> numbers = List.of( 2, 3,1,13,3,9, 10, 8, 9, 1);
		Sort(numbers);
	}
	private static void Sort(List<Integer> numbers) {
        numbers.stream().sorted().forEach(System.out::println);;
        
    }
}
