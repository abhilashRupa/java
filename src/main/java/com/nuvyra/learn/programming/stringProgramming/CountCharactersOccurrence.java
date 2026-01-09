package com.nuvyra.learn.programming.stringProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountCharactersOccurrence {

    public static void main(String[] args) {
        String fruitName = "banana";

        approach1(fruitName);
        approach2(fruitName);

        /*
         * using external map and merging count
         */
        approach3(fruitName);

       

    }

   

    private static void approach1(String fruitName) {
        System.out.println("\nusing approach 1");

        Map<Character, Long> charCount = fruitName.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charCount.entrySet()
                .stream()
                .forEach(entrySet -> System.out.println(entrySet.getKey() + " count: " + entrySet.getValue()));

    }

    private static void approach2(String fruitName) {

        System.out.println("\nusing approach 2");

        Map<String, Long> charCount = fruitName.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

        charCount.entrySet()
                .stream()
                .forEach(entrySet -> System.out.println(entrySet.getKey() + " count: " + entrySet.getValue()));

    }

     private static void approach3(String fruitName) {
        System.out.println("\nusing approach 3");

        Map<Character, Integer> charCountMap = new HashMap<>();

        fruitName.chars()
        .mapToObj(ch -> (char) ch)
        .forEach(ch -> charCountMap.merge(ch, 1, Integer::sum));

        charCountMap.entrySet()
        .stream().forEach(entrySet -> System.out.println(entrySet.getKey() + " count: "+ entrySet.getValue()));

    }

}
