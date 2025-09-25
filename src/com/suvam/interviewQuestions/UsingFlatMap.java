//  Given a list of lists of strings, flatten them into a single list of strings

package com.suvam.interviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UsingFlatMap {
    public static void main(String[] args) {
        List<List<String>> listOfLlists = Arrays.asList(
                Arrays.asList("one","two"),
                Arrays.asList("three","four")
        );
        List<String> result = listOfLlists.stream()
                .flatMap(n->n.stream())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
