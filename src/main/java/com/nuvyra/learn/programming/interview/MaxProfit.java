package com.nuvyra.learn.programming.interview;

/* 
Companies: Accolite, JPMC

121. Best Time to Buy and Sell Stock

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0

Example 3:
Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
Output: 8
Explanation: Buy for price 1 and sell for price 9. 

Example 4:
Input: prices[] = [7, 6, 4, 3, 1]
Output: 0

Example 5:
Input: prices[] = [1, 3, 6, 9, 11]
Output: 10
*/

public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = { 1, 3, 6, 9, 11 };

        // best solution
        solution1(prices);

        // for each variant
        solution2(prices);

        // using math functions
        solution3(prices);

        // Best Time to Buy and Sell Stock II (Multiple Transactions)
        solution4(prices);

    }

    /*
     * 1. initialize the min with first element profit with 0
     * 2. iterate over the price if current element is less than the min update min
     * with i
     * 3. if current element subtract with min grater than profit update the profit
     * 
     */

    private static void solution1(int[] prices) {

        int maxProfit = 0;
        int minPrice = prices[0];

        if (prices.length < 2) {
            System.out.println(0);
        }

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        System.out.println("maxProfit is using for loop: " + maxProfit);

    }

    private static void solution2(int[] prices) {

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i : prices) {
            if (i < minPrice) {
                minPrice = i;
            } else if ((i - minPrice) > maxProfit) {
                maxProfit = i - minPrice;
            }
        }

        System.out.println("maxProfit is using foreach loop: " + maxProfit);

    }

    private static void solution3(int[] prices) {

        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int currentPrice : prices) {
            min = Math.min(min, currentPrice);
            profit = Math.max((currentPrice - min), profit);
        }
        System.out.println("maxProfit is using Math function: " + profit);

    }

    // Sum all positive differences between consecutive days using a greedy
    // algorithm.
    private static void solution4(int[] prices) {

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        System.out.println("max profit Multiple Transactions: "+ profit);

    }

}
