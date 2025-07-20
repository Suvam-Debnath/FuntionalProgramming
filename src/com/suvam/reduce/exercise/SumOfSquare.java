// Square every number in the list and find the sum of squares

package com.suvam.reduce.exercise;

import java.util.List;

public class SumOfSquare {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Sum of squres : "+Sum(numbers));
	}
	private static int Sum(List<Integer> numbers) {
        return numbers.stream().map(x->x*x).reduce(0, (a,b)->a+b);
        
    }
}
