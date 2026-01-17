package com.nuvyra.learn.programming.streams.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* Write a program to convert a list of string to uppercase using Java Stream API.
* */

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> friutList = Arrays.asList("banana", "apple");

        List<String> uppercaseMap = friutList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("\nString list converted to uppercase");

        uppercaseMap.forEach(System.out::println);

    }
}
