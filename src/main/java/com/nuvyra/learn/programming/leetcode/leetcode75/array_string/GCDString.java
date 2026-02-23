package com.nuvyra.learn.programming.leetcode.leetcode75.array_string;

/* 
leetcode: 1071. Greatest Common Divisor of Strings

For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t 
(i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides
both str1 and str2.


Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""

Example 4:
Input: str1 = "AAAAAB", str2 = "AAA"
Output: ""​​​​​​​

*/

public class GCDString {

    public static void main(String[] args) {
        String word1 = "ABCABC";
        String word2 = "ABC";

        // iterative approach:
        String GCDOutput = approach1(word1, word2);
        System.out.println("Euclidean Algorithm, iterative approach: " + GCDOutput);

      
    }

    private static String approach1(String word1, String word2) {

        if (!word1.concat(word2).equals(word2.concat(word1))) {
            return "";
        }

        int word1Length = word1.length();
        int word2Length = word2.length();

        while (word2Length != 0) {

            int temp = word2Length;
            word2Length = word1Length % word2Length;
            word1Length = temp;

        }

        return word1.substring(0, word1Length);

    }

}
