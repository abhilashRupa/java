package com.nuvyra.learn.programming.stringProgramming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Java program to search a particular word in a string using regex

*/

public class FindWordUsingRegex {
    public static void main(String[] args) {

        String text = "This is a string containing the word Java.";
        String word = "Java";

        solution(text, word);

    }

    private static void solution(String text, String word) {

        Pattern pattern = Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {

            int start = matcher.start();
            int end = matcher.end();

            String match = text.substring(start, end);

            System.out.println("Found word \"" + match + " \" at index [" + start + ", " + (end - 1) + "]");

        }matcher

    }

}
