package com.nuvyra.learn.programming.interview.mphasis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.management.RuntimeErrorException;

/* Mphasis (morgan Stanley.):
write program find missing number from given range  using java 8

input: {1,3,4,6,7,10} output{2,5,8,9}

*/

public class FindMissingNumbers {

    public static void main(String[] args) {
        int[] inputArr = {1,3,4,6,7,10};

     solution(inputArr);
    }

    /* Approach:
    1. find min and max fom the array
    2. convert int of array to list as it support inbuilt functions (if array contain dup, use set)
    3. using IntStream to iterate between min to max if element is not found add the num to list    
    */

    private static void solution(int[] inputArr) {
           if(inputArr.length < 2){
            throw new RuntimeErrorException(null, "array size should be grater than 2");
        }

        int min = Arrays.stream(inputArr).min().orElse(1);
        int max = Arrays.stream(inputArr).max().orElse(10);


        List<Integer> numList = Arrays.stream(inputArr).boxed().collect(Collectors.toList());



        List<Integer> outputArr = IntStream.rangeClosed(min, max)
        .filter(num -> !numList.contains(num))
        .boxed()
        .collect(Collectors.toList());

        System.out.println(outputArr);

    }

}
