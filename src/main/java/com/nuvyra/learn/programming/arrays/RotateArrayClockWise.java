package com.nuvyra.learn.programming.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

/* 

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

 */

public class RotateArrayClockWise {

    public static void main(String[] args) {
         
        RotateArrayClockWise arrayClockWise = new RotateArrayClockWise();

        int[] numbers = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println("Before clockwise rotation:"+Arrays.toString(numbers));

        arrayClockWise.rotateClockWise(numbers, k);

        System.out.println("After clockwise rotation:"+Arrays.toString(numbers));
        
    }

     private void rotateClockWise(int[] nums, int k) {

        int arrSize = nums.length;
        k = k%arrSize;
        reverseClockWise(nums, 0, arrSize-1);
        reverseClockWise(nums, 0, k-1);
        reverseClockWise(nums, k, arrSize-1);
        
    }

    private void reverseClockWise(int[] numbers, int start, int end){
        while (start<end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

}
