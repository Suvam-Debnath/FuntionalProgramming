// sort a list of names in reverse alphabetical order

package com.suvam.interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsingSorted {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Suvam","Alice","Bob");
        List<String> result = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
