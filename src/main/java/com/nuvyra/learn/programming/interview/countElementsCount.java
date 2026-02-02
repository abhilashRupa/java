package com.nuvyra.learn.programming.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/* 
Mphasis: 
Using Java 8 find the count of each elements.
*/
public class countElementsCount {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 6, 3, 4, 7, 8, 5, 3);

        Map<Integer, Long> countMap = numbers.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap);

    }
}
