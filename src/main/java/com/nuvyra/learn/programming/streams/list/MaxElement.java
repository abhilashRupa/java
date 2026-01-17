package com.nuvyra.learn.programming.streams.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

//given a list of integers, write a program to find and print the maximum element using java Stream API

public class MaxElement {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 3, 5, 6, 75, 34, 667, 33);

        approach1(numberList);
        approach2(numberList);
        approach3(numberList);
        approach4(numberList);
        approach5(numberList);


    }

    private static void approach1(List<Integer> numberList) {
        System.out.println("\napproach 1: using lambda comparable");
        Integer maxElement = numberList.stream()
                .sorted((a1, a2) -> a2.compareTo(a1))
                .findFirst().orElse(-1);

        System.out.println("Max element is: " + maxElement);

    }

    private static void approach2(List<Integer> numberList) {
        System.out.println("\napproach 2: using comparable compareTo");

        Integer maxElement = numberList.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .findFirst().orElse(-1);
        System.out.println("Max element is: " + maxElement);

    }

    private static void approach3(List<Integer> numberList) {

        System.out.println("\napproach 3: using max function");
    

        int maxElement = numberList.stream()
        .mapToInt(Integer::intValue)
        .max().orElseThrow(RuntimeException::new);

        System.out.println("Max element is: " + maxElement);
    }

    private static void approach4(List<Integer> numberList) {
        System.out.println("\napproach 4: using max and OptionalInt function");

        OptionalInt maxElement = numberList.stream()
         .mapToInt(Integer::intValue)
         .max();

        System.out.println("Max element is: " + maxElement.getAsInt());

    }

    private static void approach5(List<Integer> numberList) {
        System.out.println("\napproach 5: using max function and java 10");

        int maxElement = numberList.stream()
        .mapToInt((Integer::intValue))
        .max()
        .orElseThrow();


        System.out.println("Max Element is: "+maxElement);
    }


}
