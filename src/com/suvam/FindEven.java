package com.suvam;

import java.util.List;

public class FindEven {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(12,3,4,5,43,55,7,9,0,7);
		printAllNumberInListFunctional(numbers);
		System.out.println("Even numbers");
		printEvenNumberInListFunctional(numbers);
	}
	private static boolean isEven(int number) {
		return number%2 == 0;
	}
	private static void printAllNumberInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.forEach(System.out::println);   //method reference
		
	}
	private static void printEvenNumberInListFunctional(List<Integer> numbers) {
		// what to do 
		numbers.stream()
		.filter(FindEven::isEven)  // Filter - Only allow even numbers
		.forEach(System.out::println);   //method reference
		
	}
}
