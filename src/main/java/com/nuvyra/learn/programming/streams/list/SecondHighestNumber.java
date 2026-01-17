package com.nuvyra.learn.programming.streams.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 7, 9, 12, 10, 20);

        approach1(numbers);
        approach2(numbers);
        approach3(numbers);
        approach4(numbers);
        approach5(numbers);

    }

    private static void approach1(List<Integer> numbers) {
        System.out.println("\napproach 1: using Comparator.reverseOrder");
        Optional<Integer> secondHighestNumber = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println("second Highest number is: " + secondHighestNumber.get());

    }

    private static void approach2(List<Integer> numbers) {
        System.out.println("\napproach 2: using comparingInt");

        Optional<Integer> secondHighestNumber = numbers.stream()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .skip(1)
                .findFirst();
        System.out.println("second Highest number is: " + secondHighestNumber.get());

    }

    private static void approach3(List<Integer> numbers) {
        System.out.println("\napproach 3: using comparing");

        Optional<Integer> secondHighestNumber = numbers.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .skip(1)
                .findFirst();
        System.out.println("second Highest number is: " + secondHighestNumber.get());

    }

    private static void approach4(List<Integer> numbers) {
        System.out.println("\napproach 4: using overloaded comparing");

        Optional<Integer> secondHighestNumber = numbers.stream()
                .sorted(Comparator.comparing(Integer::intValue, Comparator.reverseOrder()))
                .skip(1)
                .findFirst();
        System.out.println("second Highest number is: " + secondHighestNumber.get());

    }

    private static void approach5(List<Integer> numbers) {
        System.out.println("\napproach 5: using overloaded comparing");

        Optional<Integer> secondHighestNumber = numbers.stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .skip(1)
                .findFirst();
        System.out.println("second Highest number is: " + secondHighestNumber.get());
    }

}
