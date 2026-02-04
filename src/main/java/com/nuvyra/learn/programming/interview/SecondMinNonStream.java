package com.nuvyra.learn.programming.interview;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

/* 

EY: client (goldman sachs)
give integer of positive and negetive array, unsorted and duplicate numbers, find 2nd min number

i/p: [-2, -2, -1, 4, 3]
o/p: -2

desc: It means second element in sorted order (including duplicates)
*/

public class SecondMinNonStream {

    public static void main(String[] args) {

        int[] arr = { -2, -2, -1, 4, 3 };
        // int[] arr = { -3, -2, -1, 4, 3 };
        // int[] arr = { 2, 2, 1, 4, 3 };
        // int[] arr = { Integer.MAX_VALUE, Integer.MAX_VALUE };

        approach1(arr);

        // using stream
        approach2(arr);

    }

   
    private static void approach1(int[] arr) {

        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num <= secondMin) {
                secondMin = num;
            }
        }

        System.out.println(secondMin);

    }

     private static void approach2(int[] arr) {
       OptionalInt secondMin = Arrays.stream(arr)
        .sorted()
        .skip(1)
        .findFirst();

        System.out.println(secondMin);
    }


}
