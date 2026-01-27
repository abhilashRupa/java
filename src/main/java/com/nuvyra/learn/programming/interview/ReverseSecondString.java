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
        approach2(input);

    }

    private static void bestApproach(String input) {
        System.out.println("\n java 8 approach");

        String[] inputArr = input.split("\\s");

        String output = IntStream.range(0, inputArr.length)
                .mapToObj(i -> i == 1
                        ? new StringBuffer(inputArr[i]).reverse()
                        : inputArr[i])
                .collect(Collectors.joining(" "));

        System.out.println(output);

    }

    private static void approach1(String input) {
        System.out.println("\n java 8 hardcode approach ");


        List<String> inputList = Arrays.asList(input.split("\\s"));

        String output = inputList.stream()
                .map(s -> s.equalsIgnoreCase("coding") ? new StringBuilder(s).reverse() : s)
                .collect(Collectors.joining(" "));

        System.out.println(output);

    }

    private static void approach2(String input) {
        System.out.println("\n simple java approach");
        String[] inputArr = input.split("\\s");

        if(inputArr.length>=2){
            inputArr[1] = new StringBuilder(inputArr[1]).reverse().toString();
        }

        System.out.println(String.join(" ", inputArr));


        
    }

}
