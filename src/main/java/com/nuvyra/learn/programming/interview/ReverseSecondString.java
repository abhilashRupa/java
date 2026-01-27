package com.nuvyra.learn.programming.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* give an String "java coding" reverse only 2nd word from the input

i/p: java coding
o/p: java gnidoc

*/

public class ReverseSecondString {

    public static void main(String[] args) {
        String input = "java coding";

        bestApproach(input);

        approach1(input);

    }

    private static void bestApproach(String input) {

        String[] inputArr = input.split("\\s");
        
       String output = IntStream.range(0, inputArr.length)
        .mapToObj(i -> i == 1 
            ? new StringBuffer(inputArr[i]).reverse()
            : inputArr[i]
        ).collect(Collectors.joining(" "));

        System.out.println(output);

    }

    private static void approach1(String input) {

        List<String> inputList = Arrays.asList(input.split("\\s"));

        String output =inputList.stream()
        .map(s -> s.equalsIgnoreCase("coding") ? new StringBuilder(s).reverse() : s)
        .collect(Collectors.joining(" "));

        System.out.println(output);


    }

}
