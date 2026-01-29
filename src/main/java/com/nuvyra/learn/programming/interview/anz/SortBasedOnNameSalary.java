package com.nuvyra.learn.programming.interview.anz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* 
given the list of employee sort based on the name and salary
*/

public class SortBasedOnNameSalary {
    public static void main(String[] args) {

        List<EmployeeANZ> anzEmployeeList = new ArrayList<>();
        EmployeeANZ employeeANZ1 = new EmployeeANZ(1, "usa", 1000l);
        EmployeeANZ employeeANZ2 = new EmployeeANZ(2, "use", 56000l);
        EmployeeANZ employeeANZ3 = new EmployeeANZ(3, "uk", 3200l);
        EmployeeANZ employeeANZ4 = new EmployeeANZ(4, "china", 2000l);
        EmployeeANZ employeeANZ5 = new EmployeeANZ(5, "india", 1200l);
        EmployeeANZ employeeANZ6 = new EmployeeANZ(6, "africa", 14100l);
        EmployeeANZ employeeANZ7 = new EmployeeANZ(7, "spain", 1500l);
        EmployeeANZ employeeANZ8 = new EmployeeANZ(2, "usa", 500l);
        EmployeeANZ employeeANZ9 = new EmployeeANZ(2, "use", 5000l);


        anzEmployeeList.add(employeeANZ1);
        anzEmployeeList.add(employeeANZ2);
        anzEmployeeList.add(employeeANZ3);
        anzEmployeeList.add(employeeANZ4);
        anzEmployeeList.add(employeeANZ5);
        anzEmployeeList.add(employeeANZ6);
        anzEmployeeList.add(employeeANZ7);
        anzEmployeeList.add(employeeANZ8);
        anzEmployeeList.add(employeeANZ9);

        List<EmployeeANZ> sortedList = anzEmployeeList.stream()
                .sorted(Comparator.comparing(EmployeeANZ::getName)
                        .thenComparing(Comparator.comparingLong(EmployeeANZ::getSalary)))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);

    }

}
