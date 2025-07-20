// Find the cubes of odd number form the list

package com.suvam.map;

import java.util.List;

public class CubesOfOdd {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		System.out.println("cubes of odd numbers : ");
		printEvenNumber(numbers);
	}
	private static void printEvenNumber(List<Integer> numbers) {
        numbers.stream()
               .filter(num -> num % 2 != 0) // Filter even numbers
               .map(number -> number*number*number)  // mapping expressoin
               .forEach(System.out::println);
    }
}
