package com.nuvyra.learn.programming.arrays;

import java.util.Arrays;

/* 
Given an integer array nums, rotate the array to the left by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [4, 5, 6, 7, 1, 2, 3]
Explanation:
rotate 1 steps to the left: [2,3,4,5,6,7,1]
rotate 2 steps to the left: [3,4,5,6,7,1,2]
rotate 3 steps to the left: [4,5,6,7,1,2,3]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

 */

public class RotateArrayAntiClockWise {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        System.out.println("before Anti clockwise rotation:" + Arrays.toString(numbers));
        rotateAntiClockWise(numbers, k);
        System.out.println("After Anti clockwise rotation:" + Arrays.toString(numbers));

    }

    private static void rotateAntiClockWise(int[] numbers, int k) {

        int arraySize = numbers.length;

        // Handle cases where k is larger than array length
        k = k % arraySize;

        // Step 1: Reverse the first K elements
        reverseAntiClock(numbers, 0, k - 1);

        // Step 2: Reverse the remaining 'n-k' elements
        reverseAntiClock(numbers, k, arraySize - 1);

        // Step 3: Reverse the entire array
        reverseAntiClock(numbers, 0, arraySize - 1);

    }

    private static void reverseAntiClock(int[] numbers, int start, int end) {

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

    }

}
