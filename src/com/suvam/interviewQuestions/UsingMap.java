// Transform a list of strings into a list of their uppercase versions.

package com.suvam.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingMap {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("suvam","abir","krishanu","pranay");
        List<String> result = str.stream()
                .map(n->n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
