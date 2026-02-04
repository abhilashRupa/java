package com.nuvyra.learn.programming.interview.deloitte;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* 

fetch the employees with name starting with "A" and count  greater than  1

*/

public class EmployeeDeloitteMain {

    public static void main(String[] args) {

        List<EmployeeDeloitte> employees = Arrays.asList(
                new EmployeeDeloitte("Arun", 10),
                new EmployeeDeloitte("Bojja", 10),
                new EmployeeDeloitte("Amit", 30),
                new EmployeeDeloitte("Bojja", 40),
                new EmployeeDeloitte("Arun", 50),
                new EmployeeDeloitte("Chetan", 40),
                new EmployeeDeloitte("Chetan", 30));

        approach1(employees);

        // single line
        approach2(employees);

    }

    private static void approach2(List<EmployeeDeloitte> employees) {

        List<EmployeeDeloitte> employeesCountMoreThen1 = employees.stream()
        .filter(e -> e.getName().startsWith("A"))
        .collect(Collectors.groupingBy(EmployeeDeloitte::getName))
        .values()
        .stream()
        .filter(list -> list.size() > 1)
        .flatMap(List::stream)
        .toList();

        System.out.println(employeesCountMoreThen1);


    }

    private static void approach1(List<EmployeeDeloitte> employees) {

        List<String> employeesStartsWithA = employees.stream()
                .filter(e -> e.getName().startsWith("A"))
                .collect(Collectors.groupingBy(EmployeeDeloitte::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        List<EmployeeDeloitte> employeesCountMoreThen1 = employees.stream()
                .filter(e -> employeesStartsWithA.contains(e.getName()))
                .toList();

        System.out.println(employeesCountMoreThen1);

    }

}
