package com.nuvyra.learn.programming.leetcode.leetcode75.array_string;

/* 
leetcode: 1768. Merge Strings Alternately

You are given two strings word1 and word2. 
Merge the strings by adding letters in alternating order, 
starting with word1. If a string is longer than the other, 
append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 

*/

public class MergeStringsAlternately {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        // using while loop
        String mergedString = solution(word1, word2);
        System.out.println("using while loop: "+ mergedString);

    }

    // using while and ternary operator
    private static String solution(String word1, String word2) {

        int maxLength = Math.max(word1.length(), word2.length());
        StringBuilder builder = new StringBuilder();

        int start = 0;
        while (start < maxLength) {

            String char1 = (start < word1.length()) ? String.valueOf(word1.charAt(start)) : "";
            String char2 = (start < word2.length()) ? String.valueOf(word2.charAt(start)) : "";

            builder.append(char1);
            builder.append(char2);

            start++;

        }

        return builder.toString();

    }

}
