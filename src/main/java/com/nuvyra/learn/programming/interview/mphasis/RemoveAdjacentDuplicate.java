package com.nuvyra.learn.programming.interview.mphasis;

import java.util.Stack;

/* Mphasis (morgan Stanley.):

Remove Adjacent Duplicate Characters Input: "abbaca" Output: "ca"


*/

public class RemoveAdjacentDuplicate {
    public static void main(String[] args) {

        String input = "abbaca";

        // using stack
        solution1(input);

        // using StringBuilder
        solution(input);
        solution2(input);

    }

    /* 
    1. create stack
    2. iterate over input string
    3. if stack is not empty and top element is same as current char then remove top element from stack
    4. else add to the stack
    */
    private static void solution1(String input) {

        Stack<Character> outputStack = new Stack<>();

        for (char ch : input.toCharArray()) {

            if(!outputStack.isEmpty() && outputStack.peek() == ch){
                outputStack.pop();

            }else{
                outputStack.push(ch);
            }

        }


        StringBuilder outputBuilder = new StringBuilder();

        while (!outputStack.empty()) {
            outputBuilder.append(outputStack.pop());

            
        }

        System.out.println("using stack: "+outputBuilder.reverse().toString());


    }

    /*
     * 
     * 1. create the string builder
     * 2. iterator over the input string
     * 3. if string builder is not empty and last character is same as current
     * char
     * 4. remove the last char
     * 5. if they are different add
     * 
     */
    private static void solution(String input) {

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (output.length() > 0 && output.charAt(output.length() - 1) == ch) {
                output.deleteCharAt(output.length() - 1);
            } else {
                output.append(ch);
            }
        }

        System.out.println("using for loop:" + output.toString());

    }

    private static void solution2(String input) {
        StringBuilder output = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (output.length() > 0 && output.charAt(output.length() - 1) == ch) {
                output.deleteCharAt(output.length() - 1);

            } else {
                output.append(ch);
            }
        }
        System.out.println("using foreach loop:" + output.toString());
    }

}
