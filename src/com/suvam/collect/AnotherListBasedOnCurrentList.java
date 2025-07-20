// Create another list(square of present list) based on present list

package com.suvam.collect;

import java.util.List;
import java.util.stream.Collectors;

public class AnotherListBasedOnCurrentList {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Current list : "+numbers);
		List<Integer> doubleList = doubleList(numbers);
		System.out.println("New list : "+doubleList);
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		return numbers.stream()
				.map(num->num*num)
				.collect(Collectors.toList());  //
	}
}

/*
 numbers.stream()
Converts the list numbers into a Stream.

A Stream is a sequence of elements that supports functional-style operations.

2. .map(num -> num * num)
map is used to transform each element of the stream.

Here, each number num is replaced with its square (num * num).

Example:

Input list: [1, 2, 3]

After map: [1, 4, 9]

3. .collect(Collectors.toList())
After mapping, we need to gather the results back into a list.

collect() is a terminal operation that converts the stream back into a collection.

Collectors.toList() is a utility method that tells Java to collect elements into a List.

output : A new list with all elements squared, without modifying the original list.
  */
