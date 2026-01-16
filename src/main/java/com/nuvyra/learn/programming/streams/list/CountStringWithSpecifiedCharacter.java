package com.nuvyra.learn.programming.streams.list;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
* Given a list of string, write a program to count the number of string containing character 'a' using Java Stream API.
* */

public class CountStringWithSpecifiedCharacter {

    public static void main(String[] args) {
        List<String> fruitsNames = Arrays.asList("apple", "banana", "orange", "grape", "plum", "kiwi");
        char givenChar = 'a';

        findOccurrenceUsingCount(fruitsNames, givenChar);
        findOccurrenceUsingCollect(fruitsNames, givenChar);

    }

    private static void findOccurrenceUsingCount(List<String> fruitsNames, char givenChar) {
        System.out.println("\napproach 1: using stream and count method");

        long count = fruitsNames.stream()
                .filter(value -> value.contains(String.valueOf(givenChar)))
                .count();

        System.out.println("number of string with given character: " + count);
    }

    private static void findOccurrenceUsingCollect(List<String> fruitsNames, char givenChar) {

        System.out.println("\napproach 2: using collect, toList, size");

        List<String> occurrenceCount = fruitsNames.stream()
                .filter(value -> value.contains(String.valueOf(givenChar)))
                .collect(Collectors.toList());

        System.out.println("number of Strings with " + givenChar + " is " + occurrenceCount.size());

    }

}
