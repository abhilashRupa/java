package com.nuvyra.learn.programming.streams.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class FindHighestValue {

    public static void main(String[] args) {
        Map<String, Integer> empMap = new HashMap<>();
        empMap.put("HR", 5);
        empMap.put("IT", 6);
        empMap.put("FINANCE", 8);
        empMap.put("operator", 2);
        empMap.put("manager", 3);

        approach1(empMap);
    }

    private static void approach1(Map<String,Integer> empMap) {

        Optional<Entry<String, Integer>> highestValue = empMap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .findFirst();

        System.out.println(highestValue.get());

    }
}
