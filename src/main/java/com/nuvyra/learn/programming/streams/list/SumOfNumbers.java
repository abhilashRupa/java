package com.nuvyra.learn.programming.streams.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Integer sumOfNUmbers = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sum of the numbers: " + sumOfNUmbers);

    }

}
