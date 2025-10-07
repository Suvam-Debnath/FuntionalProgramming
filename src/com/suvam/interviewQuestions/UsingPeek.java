// Print each element in a list while converting them to uppercase

package com.suvam.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingPeek {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry");
        List<String> result = words.stream()
                .peek(word-> System.out.println("Original: "+word))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
