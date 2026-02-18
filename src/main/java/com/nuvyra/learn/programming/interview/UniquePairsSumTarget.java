package com.nuvyra.learn.programming.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* 
interview: multiple companies

https://leetcode.com/discuss/post/3956249/unique-pairs-with-target-sum-by-dhanush-aeycw/


Given an array of integers and a target sum,
find all unique pairs of numbers that add up to the target.
example 1:
{2, 7, 11, 15, -2, 9, 1}
target = 9

example 2:
{1, 5, 1, 5, 2, 4}
target = 6

Example 3 : 
Input : {2, 4, 3, 6, 7, 1, 5}
TargetSum : 8
Output : [ [ 2, 6 ], [ 1, 7 ], [ 3, 5 ] ]
*/
public class UniquePairsSumTarget {

    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15, -2, 9, 1};
        int target = 9;

        // using map approach
        solution(input, target);

        // using set
        solution1(input, target);
    }

    // https://www.geeksforgeeks.org/dsa/print-all-pairs-with-given-sum/
    private static void solution(int[] input, int target) {

        List<List<Integer>> uniquePairs = new ArrayList<>();

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i : input) {
            int complement = target - i;

            if (i == complement) {
                if (frequency.getOrDefault(complement, 0) == 1) {
                    uniquePairs.add(Arrays.asList(i, complement));
                }
            } else if (frequency.getOrDefault(complement, 0) > 0 && frequency.getOrDefault(i, 0) == 0) {
                List<Integer> currentPair = Arrays.asList(Math.min(complement, i), Math.max(complement, i));
                uniquePairs.add(currentPair);

            }

            frequency.put(i, frequency.getOrDefault(i, 0) + 1);

        }

        System.out.println("using map approach: " + uniquePairs);

    }

    // Unique Pairs with Target Sum (leetcode)
    private static void solution1(int[] input, int target) {

        Set<List<Integer>> uniquePairs = new HashSet<>();

        Set<Integer> seenIntegers = new HashSet<>();

        for (int i : input) {

            int complement = target - i;

            if (seenIntegers.contains(complement)) {
                List<Integer> pair = Arrays.asList(Math.min(i, complement), Math.max(i, complement));
                uniquePairs.add(pair);
            } else {
                seenIntegers.add(i);
            }
        }

        System.out.println("using set approach: " + uniquePairs);

    }

}

/*
 * other sample inputs:
 * 
 * input: {1, 2, 4, 4, 7, 5, 3};
 * target: 8;
 * output: [[1, 7], [3, 5], [4, 4]]
 * 
 * input: {1, 1, 1, 1};
 * int target2 : 2;
 * output: [[1, 1]]
 * 
 * input: {1, 2, 3, 4};
 * target: 5;
 * 
 */