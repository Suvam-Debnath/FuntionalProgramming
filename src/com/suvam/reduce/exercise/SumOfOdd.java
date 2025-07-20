// Find the sum of odd numbers in the list

package com.suvam.reduce.exercise;

import java.util.List;

public class SumOfOdd {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Sum of odds : "+Sum(numbers));
	}
	private static int Sum(List<Integer> numbers) {
        return numbers.stream().filter(x->x%2!=0).reduce(0, Integer::sum);
        
    }
}
