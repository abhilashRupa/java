package com.nuvyra.learn.programming.interview.anz;

public class StringEqual {
    public static void main(String[] args) {
        String s = "java";
        String s1 = "ja"+"va";
    
        //extra 
        String s2 = new String();

        System.out.println(s == s1);
        System.out.println(s.equals(s1));
    }

}
