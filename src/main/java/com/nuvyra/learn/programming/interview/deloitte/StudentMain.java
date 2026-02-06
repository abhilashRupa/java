package com.nuvyra.learn.programming.interview.deloitte;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* 
List students sorted by age and then by grade
*/

public class StudentMain {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(

                new Student("Rahul", "Sharma", "Hyderabad", 8.38, 19, "Civil"),

                new Student("Amit", "Verma", "Delhi", 8.4, 21, "IT"),

                new Student("Suresh", "Reddy", "Chennai", 7.5, 20, "Civil"),

                new Student("Kiran", "Patel", "Mumbai", 9.1, 20, "IT"),

                new Student("Arjun", "Naidu", "Bengaluru", 7.83, 20, "Civil")

        );

       List<Student> studentsList = students.stream()
       .sorted(Comparator.comparingInt(Student::getAge).thenComparing(Student::getGrade))
       .collect(Collectors.toList());

       studentsList.forEach(System.out::println);

    }



}
