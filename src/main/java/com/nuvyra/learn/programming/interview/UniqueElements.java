package com.nuvyra.learn.programming.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 
Mphasis: 
Using Java 8 Find all unique elements.
*/

public class UniqueElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 6, 3, 4, 7, 8, 5, 3);

        List<Integer> uniqueElements = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueElements);

    }

}
