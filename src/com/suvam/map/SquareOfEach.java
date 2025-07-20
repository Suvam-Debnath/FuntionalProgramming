//Find the squares of Even numbers in the list

package com.suvam.map;

import java.util.List;

import com.suvam.FindEven;

public class SquareOfEach {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		System.out.println("Squares of even number : ");
		printEvenNumber(numbers);
	}
	private static void printEvenNumber(List<Integer> numbers) {
        numbers.stream()
               .filter(num -> num % 2 == 0) // Filter even numbers
               .map(number -> number*number)  // mapping expressoin
               .forEach(System.out::println);
    }
}
