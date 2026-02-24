package com.nuvyra.learn.programming.leetcode.leetcode75.array_string;

/* 
leetcode: 605. Can Place Flowers

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false

Example 3:
Input: flowerbed = [1,0,0,0,0,1], n = 2
Output: false

Example 4:
flowerbed = [0,0,1,0,1], n=1
Output: true

flowerbed = [1,0,0,0,1,0,0], n =2
Output: true

*/

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = { 0, 0, 0, 0, 1, 0, 1 };
        int availablePlants = 1;

        // best approach
        boolean isAvailablePlantsEmpty2 = solution2(flowerbed, availablePlants);
        System.out.println("solution using best approach: " + isAvailablePlantsEmpty2);

        // conditional approach not recommended
        boolean isAvailablePlantsEmpty = solution(flowerbed, availablePlants);
        System.out.println("solution using normal approach: " + isAvailablePlantsEmpty);

    }

    private static boolean solution2(int[] flowerbed, int availablePlants) {
        if (availablePlants == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                availablePlants--;
                if (availablePlants == 0) {
                    return true;
                }
            }
        }

        return availablePlants == 0;
    }

    private static boolean solution(int[] flowerbed, int availablePlants) {

        if (availablePlants == 0) {
            return true;
        }

        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            availablePlants--;
            return (availablePlants == 0);
        }

        int previous = -1;
        int next = -1;
        int current = flowerbed[0];

        for (int i = 0; i < flowerbed.length; i++) {
            if (i != 0) {
                previous = flowerbed[i - 1];
            }

            if (i != flowerbed.length - 1) {
                next = flowerbed[i + 1];
            }

            current = flowerbed[i];

            if (i == 1 && previous == 0 && current == 0) {
                availablePlants--;
                flowerbed[i - 1] = 1;

            } else if (previous == 0 && current == 0 && next == 0) {
                availablePlants--;
                flowerbed[i] = 1;
            }

            if (availablePlants == 0) {
                return true;
            }
        }

        return (availablePlants == 0);

    }

}
