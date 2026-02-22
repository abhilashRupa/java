package com.nuvyra.learn.programming.numbers;

/* 
Find GCD of given 2 numbers
input: n1: 48, n2: 36
ouput: 12

input: n1: -42, n2: 56
ouput: 14

input: n1: 81, n2: 153
ouput: 9
*/

public class FindGCD {

    public static void main(String[] args) {
        int n1 = 48, n2 = 36;

        // Using Euclidean Algorithm, Recursive approach
        int gcdOutput = solution1(n1, n2);
        System.out.println("gcd calculation using Euclidean Algorithm, Recursive approach: " + gcdOutput);

        int gcdOutputApproach2 = solution2(n1, n2);
        System.out.println("gcd calculation using Euclidean Algorithm, iterative approach: " + gcdOutputApproach2);

        // using inbuilt function: not working need to check
        /*
         * int gcdOutputApproach3 = solution3(n1, n2);
         * System.out.println("gcd calculation using inbuilt function: " +
         * gcdOutputApproach3);
         */
    }

    private static int solution1(int n1, int n2) {

        if (n2 == 0)
            return n1;

        return solution1(n2, n1 % n2);

    }

    private static int solution2(int n1, int n2) {

        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        return n1;

    }

    // todo: need to fix gcd method is not resolved
    /*
     * private static int solution3(int n1, int n2) {
     * 
     * return Math.gcd(n1, n2);
     * 
     * }
     */

}
