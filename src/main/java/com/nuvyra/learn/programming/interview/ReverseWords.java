package com.nuvyra.learn.programming.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 

Companies: altimetrick
using java 8
input: "My name is Bob" 
output: "Bob is name My"
*/

public class ReverseWords {

    public static void main(String[] args) {
        String input = "My name is Bob";

        // using collections reverse
        solution(input);

        // using IntStream
        solution1(input);

        // using reduce (this is not recommended, as string concatenation in reduce)
        solution2(input);

    }

    private static void solution(String input) {

        List<String> words = Arrays.asList(input.split("\\s"));

        Collections.reverse(words);

        String output = words.stream()
                .collect(Collectors.joining(" "));

        System.out.println("using Collections reverse: " + output);

    }

    private static void solution1(String input) {

        String[] inputArr = input.split(" ");

        String output = IntStream.range(0, inputArr.length)
                .mapToObj(i -> inputArr[inputArr.length - 1 - i])
                .collect(Collectors.joining(" "));

        System.out.println("using Intstream: " + output);

    }

    private static void solution2(String input) {

        String output = Arrays.stream(input.split(" "))
                .reduce((a, b) -> b + " " + a)
                .orElse("");

        System.out.println("using reduce: " + output);

    }

}
