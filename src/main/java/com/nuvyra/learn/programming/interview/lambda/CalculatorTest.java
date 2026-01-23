package com.nuvyra.learn.programming.interview.lambda;

/* 
write java program to demonstrate custom Function interface and it's implementation usage
*/

public class CalculatorTest {

    public static void main(String[] args) {
        
        Calculator  calculator = (a, b) -> System.out.println("sum of 2 number using lambda is"+ (a+b));

        calculator.add(2, 5);

    }

}
