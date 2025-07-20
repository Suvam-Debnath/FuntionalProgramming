// create a list of even from existing list without modifying existing list

package com.suvam.collect;

import java.util.List;
import java.util.stream.Collectors; 


public class EvenFromList {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Current list : "+numbers);
		List<Integer> doubleList = Even(numbers);
		System.out.println("New list : "+doubleList);
	}

	private static List<Integer> Even(List<Integer> numbers) {
		return numbers.stream()
				.filter(n->n%2==0)
				.collect(Collectors.toList());
	}
}
