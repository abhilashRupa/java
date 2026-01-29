package com.nuvyra.learn.programming.interview.anz;

/* 
predict the output and explain
*/

public class EmployeeANZMain {
    public static void main(String[] args) {
        EmployeeANZ employeeANZ1 = new EmployeeANZ(1, "java", 20000l);
        EmployeeANZ employeeANZ2 = new EmployeeANZ(1, "java", 20000l);


        /* assume equals and hashCode not overridden */

        if (employeeANZ1 == employeeANZ2) {
            System.out.println(1);
        } else if (employeeANZ1.equals(employeeANZ2)) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }


        /* assume equals and hashCodes are overridden */

         if (employeeANZ1 == employeeANZ2) {
            System.out.println(1);
        } else if (employeeANZ1.equals(employeeANZ2)) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
       

    }

}
