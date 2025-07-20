package com.suvam;

import java.util.List;

public class Functional1 {
	public static void main(String[] args) {
		printAllNumberInListFunctional(List.of(12,3,4,5,43,55,7,9,0,7));
	}

	/*
	 * private static void print(int number) { System.out.print(number+" "); }
	 */
	
	private static void printAllNumberInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.forEach(System.out::println);   //method reference
		
	}
}
