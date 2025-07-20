package com.suvam.Exercise1;

import java.util.List;

public class EvenOdd {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        System.out.println("All Numbers:");
        printAllNumber(numbers);

        System.out.println("Odd Numbers:");
        printOddNumber(numbers);

        System.out.println("Even Numbers:");
        printEvenNumber(numbers);
	}
	private static void printAllNumber(List<Integer> numbers) {
        numbers.stream()
               .forEach(System.out::println); // Method reference
    }

    private static void printOddNumber(List<Integer> numbers) {
        numbers.stream()
               .filter(num -> num % 2 != 0) // Filter odd numbers
               .forEach(System.out::println);
    }

    private static void printEvenNumber(List<Integer> numbers) {
        numbers.stream()
               .filter(num -> num % 2 == 0) // Filter even numbers
               .forEach(System.out::println);
    }
}
