package com.nuvyra.learn.programming.interview;

import java.util.Stack;

/* 
interview: altimetrick
leetcode: 20. Valid Parentheses

String input="([]{})"
output: true,


*/
public class ValidParentheses {

    public static void main(String[] args) {

        String input = "([]{})";

        // using stack
        boolean output = solution(input);

        System.out.println("input: " + input + " is Parentheses balanced? : " + output);

    }

    /*
     * create new stack
     * iterate over input
     * if it is opening bracket add to the stack
     * if it is closing check stack is empty if yes return false, if not check
     * current closing bracket matches with last open bracket if not return false
     * 
     * at end return stack is empty or not
     * 
     */

    private static boolean solutionDeque(String input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'solutionDeque'");
    }

    private static boolean solution(String input) {

        if (null == input && input.length() % 2 != 0) {
            return false;
        }

        Stack<Character> characters = new Stack<>();

        for (Character character : input.toCharArray()) {

            if (character == '(' || character == '{' || character == '[') {
                characters.push(character);
            } else {
                if (characters.isEmpty()) {
                    return false;
                }

                Character lastElement = characters.pop();

                if ((character == ']' && lastElement != '[')
                        || (character == '}' && lastElement != '{')
                        || (character == ')' && lastElement != '(')) {
                    return false;
                }
            }
        }

        return characters.isEmpty();

    }

}

/*
 * other sample inputs:
 * 
 * 
 * balanced:
 * {[()]}
 * ([{{[(())]}}])
 * 
 * not balanced
 * {{[]()}}}}
 * {[(])}
 * 
 * Example 1:
 * Input: s = "()"
 * Output: true
 * 
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * 
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * 
 * Example 4:
 * Input: s = "([])"
 * Output: true
 * 
 * Example 5:
 * Input: s = "([)]"
 * Output: false
 * 
 * 
 */