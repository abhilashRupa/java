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
        int n1 = 81, n2 = 153;

        //Using Euclidean Algorithm, Recursive approach
        int gcdOutput = solution1(n1, n2);
        System.out.println("gcd calculation using Euclidean Algorithm, Recursive approach: "+gcdOutput);
        
    }

    
    private static int solution1(int n1, int n2) {  


        if(n2 == 0)
            return n1;


        return solution1(n2, n1%n2);

    }

}
