package com.suvam.reduce;

import java.util.List;

public class Sum {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		
		System.out.println("summation : "+printSummation(numbers));
	}

	/*
	 * private static int sumation(int a, int b) { return a+b; }
	 */
	private static int printSummation(List<Integer> numbers) {
        //return numbers.stream().reduce(0,Sum::sumation);
        // combine them into one result => one value
        return numbers.stream().reduce(0,(x,y)->x+y);
        
    }
}
