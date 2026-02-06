package com.nuvyra.learn.programming.interview.deloitte;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/* 
 Extract first names from a list of full names
Arrays.asList("John Paul", "Bob Harris", "Charlie Lou");

*/

public class FindFirstNames {

    public static void main(String[] args) {

        List<String> fullNameList = Arrays.asList("John Paul", "Bob Harris", "Charlie Lou");

        List<String> firstNames = fullNameList.stream()
        .map(FindFirstNames::getFirstName)
        .collect(Collectors.toList());

        firstNames.forEach(System.out::println);

        
    }

    private static String getFirstName(String fullName){
      String[] name = fullName.split("\\s");
      return name[0];
    }

}
