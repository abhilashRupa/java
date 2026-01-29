package com.nuvyra.learn.programming.objects;


/* 
how to check 2 objects are equal in java
*/

public class PersonMain {

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);

        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
    }

}
