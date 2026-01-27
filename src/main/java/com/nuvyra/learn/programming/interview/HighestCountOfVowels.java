package com.nuvyra.learn.programming.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*

NTT Data:
write a code find string with highest count of Vowels from given list:

List<String> str = Arrays.asList("Hi Candidate", "Welcome to Nttdata", "have a nice day");
*/

public class HighestCountOfVowels {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Hi Candidate", "Welcome to Nttdata", "have a nice day");

        approach1(str);
        approach2(str);

    }

    // this method return the count of vowels in given string.
    public static long countVowels(String input) {

        return input.toLowerCase()
                .chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1) // checks the character is part of vowels,
                .count(); // "aeiou".indexOf(ch) return -1 if given char is not part of "aeiou"

    }

    private static void approach1(List<String> str) {

        System.out.println("\n approach 1");

        // collect the count of vowels present with respective given string in the map
        Map<String, Long> countMap = str.stream()
                .collect(Collectors.toMap(Function.identity(), HighestCountOfVowels::countVowels));

        // find the max vowel count from the map based on comparing.
        Optional<Entry<String, Long>> maxVowelsCount = countMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findAny();

        System.out.println(maxVowelsCount.get().getKey() + " :: vowels count :: " + maxVowelsCount.get().getValue());

        // multiple entry has max count of vowels

        System.out.println("\n approach 1.1, if multiple entry has max count");

        // find the max count
        Long maxCountValue = countMap.values()
                .stream()
                .mapToLong(Long::longValue)
                .max()
                .orElse(0);

        // from the countMap filter the entry whose value is max

        countMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == maxCountValue)
                .forEach(System.out::println);
    }

    private static void approach2(List<String> str) {
        System.out.println("\n approach 2");

        Map<String, Long> countMap = str.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.summingLong(HighestCountOfVowels::countVowels)));

        Optional<Entry<String, Long>> maxVowelsCount = countMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        System.out.println(maxVowelsCount.get().getKey() + " :: vowels count :: " + maxVowelsCount.get().getValue());

    }

}
