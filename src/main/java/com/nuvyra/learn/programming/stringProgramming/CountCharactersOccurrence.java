package com.nuvyra.learn.programming.stringProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
    java program to count the number of characters present in given string

*/

public class CountCharactersOccurrence {

    public static void main(String[] args) {
        String fruitName = "banana";

        splitApproach(fruitName);

        approach1(fruitName);
        approach2(fruitName);

        /*
         * using external map and merging count
         */
        approach3(fruitName);

        /* java 11: using codepoints */
        approach4(fruitName);
        approach5(fruitName);
        approach6(fruitName);

    }

    private static void splitApproach(String fruitName) {
        System.out.println("\nusing split approach ");

        String[] fruitNameChar = fruitName.split("");

        Map<String, Long> charCountMap = Stream.of(fruitNameChar)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charCountMap.entrySet()
                .parallelStream()
                .forEach(entry -> System.out.println(entry.getKey() + "  count: " + entry.getValue()));

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
                .stream().forEach(entrySet -> System.out.println(entrySet.getKey() + " count: " + entrySet.getValue()));

    }

    private static void approach4(String fruitName) {
        System.out.println("\napproach 4");
        fruitName.codePoints()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(entrySet -> System.out.println(entrySet.getKey() + " count " + entrySet.getValue()));

        System.out.println("\napproach 4.1");

        fruitName.codePoints()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(entrySet -> System.out.println(entrySet.getKey() + " count " + entrySet.getValue()));

    }

    private static void approach5(String fruitName) {
        System.out.println("\napproach 5");

        Map<String, Long> charCount = fruitName.codePoints()
                .mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charCount.entrySet()
                .stream()
                .forEach(entrySet -> System.out.println(entrySet.getKey() + " count: " + entrySet.getValue()));

    }

    private static void approach6(String fruitName) {
        System.out.println("\napproach 6");

        Map<String, Long> charCount = fruitName.chars()
                .mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charCount.entrySet()
                .stream().forEach(entry -> System.out.println(entry.getKey() + " count: " + entry.getValue()));

    }

}
