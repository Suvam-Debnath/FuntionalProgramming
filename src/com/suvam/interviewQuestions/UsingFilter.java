// Fetch all numbers from a list that are greater than 5

package com.suvam.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingFilter {
    public  static void main(String args[]){
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> result = num.stream()
                .filter(n->n>5)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
