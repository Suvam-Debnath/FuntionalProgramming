package com.suvam;

import java.util.List;

public class FindOdd {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,0);
		printAllNumberInListFunctional(numbers);
		System.out.println("Odd numbers");
		printOddNumberInListFunctional(numbers);
	}
	private static void printAllNumberInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.forEach(System.out::println);   //method reference
		
	}
	private static void printOddNumberInListFunctional(List<Integer> numbers) {
		// what to do 
		numbers.stream()
		.filter(num -> num%2 != 0)  // Filter - Only allow odd numbers
		.forEach(System.out::println);   //method reference
		
	}
}
