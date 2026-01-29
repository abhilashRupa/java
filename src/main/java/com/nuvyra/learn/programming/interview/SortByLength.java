package com.nuvyra.learn.programming.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* 
capgemini:

Using Java 8, Sort the given words of String by its length
Input: Welcome to Java
Output: to Java Welcome

*/

public class SortByLength {
    public static void main(String[] args) {
        String input = "Welcome to Java";
        System.out.println("input: "+input);

        List<String> words = Arrays.asList(input.split("\\s"));

       String sortByLength = words.stream()
        .sorted(Comparator.comparingInt( String::length))
        .collect(Collectors.joining(" "));

        System.out.println("output: "+ sortByLength);

        

    }

}
