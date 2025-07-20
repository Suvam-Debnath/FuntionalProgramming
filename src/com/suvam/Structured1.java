package com.suvam;

import java.util.List;

public class Structured1 {
	public static void main(String args[]) {
		printAllNumberInListStrutured(List.of(12,3,4,5,43,55,7,9,0,7));
	}

	private static void printAllNumberInListStrutured(List<Integer> numbers) {
		for(int x : numbers) {
			System.out.print(x+" ");
		}
		
	}
}
