package com.nuvyra.learn.programming.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/* write Java program to find the department wise maximum salary */

public class DepartmentWiseMaxSalary {
    public static void main(String[] args) {
        List<EmployeeDepartmentWiseMaxSalaryDTO> employees = Arrays.asList(
                new EmployeeDepartmentWiseMaxSalaryDTO("Alice", "IT", 90000),
                new EmployeeDepartmentWiseMaxSalaryDTO("Bob", "HR", 50000),
                new EmployeeDepartmentWiseMaxSalaryDTO("Charlie", "IT", 120000),
                new EmployeeDepartmentWiseMaxSalaryDTO("David", "Finance", 75000),
                new EmployeeDepartmentWiseMaxSalaryDTO("Eve", "HR", 60000),
                new EmployeeDepartmentWiseMaxSalaryDTO("Frank", "IT", 95000),
                new EmployeeDepartmentWiseMaxSalaryDTO("Grace", "Finance", 80000));

        // Method 1: Using summarizingDouble for detailed stats (including max)
        Map<String, DoubleSummaryStatistics> departmentWiseMaxSalary1 = employees.stream()
        .collect(Collectors.groupingBy(EmployeeDepartmentWiseMaxSalaryDTO::getDepartment, Collectors.summarizingDouble(EmployeeDepartmentWiseMaxSalaryDTO::getSalary)));

        System.out.println("--- Method 1: Using DoubleSummaryStatistics ---");
        departmentWiseMaxSalary1.forEach((dept, stats) -> {
            System.out.println("Department: " + dept + ", Max Salary: " + stats.getMax());
        } );

        // Method 2: Using maxBy and comparingDouble to get the Employee object with max
        Map<String, Optional<EmployeeDepartmentWiseMaxSalaryDTO>> departmentWiseMaxSalary2 = employees.stream()
                .collect(Collectors.groupingBy(EmployeeDepartmentWiseMaxSalaryDTO::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(EmployeeDepartmentWiseMaxSalaryDTO::getSalary))));

        System.out.println("\n--- Method 2: Using maxBy and comparingDouble (Employee Object) ---");
        departmentWiseMaxSalary2.forEach((dept, OptionalEmp) -> {
            OptionalEmp.ifPresent(emp -> {
                System.out.println("Department: " + dept + ", Max Salary: " + emp.getSalary());
            });
        });

         // Method 3: Using maxBy and comparing to get the Employee object with max
        Map<String, Optional<EmployeeDepartmentWiseMaxSalaryDTO>> departmentWiseMaxSalary3 = employees.stream()
                .collect(Collectors.groupingBy(EmployeeDepartmentWiseMaxSalaryDTO::getDepartment,
                        Collectors.maxBy(Comparator.comparing(EmployeeDepartmentWiseMaxSalaryDTO::getSalary))));

        System.out.println("\n--- Method 3: Using maxBy and comparing (Employee Object) ---");
        departmentWiseMaxSalary3.forEach((dept, OptionalEmp) -> {
            OptionalEmp.ifPresent(emp -> {
                System.out.println("Department: " + dept + ", Max Salary: " + emp.getSalary());
            });
        });

    }

}
