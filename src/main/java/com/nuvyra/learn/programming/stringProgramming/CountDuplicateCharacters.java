package com.nuvyra.learn.programming.stringProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
    java program to count the number of duplicate characters present in given string

*/

public class CountDuplicateCharacters {

    public static void main(String[] args) {
        String fruiteName = "banana";

        approach1UsingGroupBy(fruiteName);
        approach2UsingExternalMap(fruiteName);

        /* Java 11 Function */

        approach3(fruiteName);

        /* convert to string array */
        approach4(fruiteName);
    }



    private static void approach1UsingGroupBy(String fruiteName) {

        // using Function.identity()

        System.out.println("\napparoch 1.0");

        Map<Character, Long> charCountMap = fruiteName.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " count: " + entry.getValue()));

        // using Object::toString

        System.out.println("\napparoch 1.1");

        Map<String, Long> duplicateCharCount = fruiteName.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(duplicateCharCount);

    }

    private static void approach2UsingExternalMap(String fruiteName) {
        
        System.out.println("\napproach 2 using external map merge function");

            Map<Character, Integer> countMap = new HashMap<>();

            fruiteName.chars()
            .mapToObj(ch -> (char) ch)
            .forEach(chatacter -> countMap.merge(chatacter, 1, Integer::sum));

            Map<Character, Integer> duplicateCount = countMap.entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            System.out.println(duplicateCount);

    }

        private static void approach3(String fruiteName) {

            System.out.println("\napproach 3 using codepoints");

            fruiteName.codePoints()
            .mapToObj(Character::toString)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .forEach(entry -> System.out.println(entry.getKey()+" count: "+entry.getValue()));

            System.out.println("\napproach 3.1 using codepoints");

            fruiteName.codePoints()
            .mapToObj(ch -> (char) ch)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .forEach(entry -> System.out.println(entry.getKey()+" count: "+entry.getValue()));

    }

        private static void approach4(String fruiteName) {

            System.out.println("\napprich 4 using array");

          String[] fruitsChar = fruiteName.split("");

          Map<String, Long> duplicateCount = Stream.of(fruitsChar)
          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
          .entrySet()
          .stream()
          .filter(entry -> entry.getValue() >1)
          .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

          System.out.println(duplicateCount);
    }


}
