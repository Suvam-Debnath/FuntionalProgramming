package com.suvam.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingDistinct {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,2,3,3,4);
        List<Integer> result = num.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
