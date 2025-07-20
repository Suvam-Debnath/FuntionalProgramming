package com.suvam.reduce;

import java.util.List;

public class MaxNum {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Maximum : "+Min(numbers));
	}
	private static int Min(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MIN_VALUE,(x,y)->x>y?x:y);
        
    }
}
