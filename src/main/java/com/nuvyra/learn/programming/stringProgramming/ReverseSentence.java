package com.nuvyra.learn.programming.stringProgramming;

import java.util.Arrays;

/* 

reverse the sentence using using and without using inbuilt function.

*/

public class ReverseSentence {

    public static void main(String[] args) {
        String input = "my name is ABC";

        System.out.println("input: " + input);

        // without using any functions
        approach1(input);

        // using StringBuilder reverse
        approach2(input);


        // try using stream
    }

    private static void approach1(String input) {
        System.out.println("\n without using any inbuilt function, using in-place swap ");

        char[] inputArr = input.toCharArray();

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            char temp = inputArr[start];
            inputArr[start] = inputArr[end];
            inputArr[end] = temp;

            start++;
            end--;

        }

        System.out.println(String.valueOf(inputArr));

    }

    private static void approach2(String input) {

        System.out.println("\n using string builder reverse");
        StringBuilder stringBuilder = new StringBuilder(input).reverse();
        System.out.println(stringBuilder.toString());

    }

   

}
