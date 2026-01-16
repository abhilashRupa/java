package com.nuvyra.learn.programming.streams.list;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountDuplicateStringFromList {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("a", "b", "d", "a", "a", "b", "z", "z", "b", "b", "b");

        approach1(names);
        approach2(names);

    }

    private static void approach1(List<String> names) {
        System.out.println("approach 1: using stream functions");

        Map<String, Long> duplicateCountMap = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("duplicate count map: " + duplicateCountMap);

    }

    private static void approach2(List<String> names) {
        System.out.println("approach 2: using external map and merge");

        Map<String, Integer> countMap = new HashMap<>();

        names.stream()
                .forEach(value -> countMap.merge(value, 1, Integer::sum));

        countMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(duplicateEntry -> System.out
                        .println(duplicateEntry.getKey() + " count: " + duplicateEntry.getValue()));

    }

}
