package com.nuvyra.learn.programming.interview.mphasis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 
Mphasis (morgan Stanley.):

find the valid names from the array of String using java8
String arr[]={"john","S#m","123","###12","player"} output{"john","player"} using java8


*/
public class FindValidNames {

    public static void main(String[] args) {

        String[] inputArr = { "john", "S#m", "123", "###12", "player" };

        // best solutions
        solution(inputArr);

        // other solutions
        solution1(inputArr);

        // extra try: find valid words
        solution2(inputArr);

    }

    /* use the regex pattern matching for each element */
    private static void solution(String[] inputArr) {

        List<String> outputArr = Arrays.stream(inputArr)
                .filter(name -> name.matches("^[a-zA-Z]+$"))
                .collect(Collectors.toList());

        System.out.println("best approach: "+outputArr);

    }

    private static void solution1(String[] inputArr) {
        List<String> outputArr = Arrays.stream(inputArr)
                .filter(name -> name.matches("[a-z]+"))
                .collect(Collectors.toList());

        System.out.println(outputArr);
    }

    private static void solution2(String[] inputArr) {

        List<String> outputArr = Arrays.stream(inputArr)
                .filter(name -> name.matches("\\w+"))
                .collect(Collectors.toList());

        System.out.println(outputArr);

    }
}
