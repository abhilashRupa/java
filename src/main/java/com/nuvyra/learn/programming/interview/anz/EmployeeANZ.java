package com.nuvyra.learn.programming.interview.anz;

import java.util.Objects;

public class EmployeeANZ {

    private int id;
    private String name;
    private Long salary;

    public EmployeeANZ(int id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /* case if you override the equal method */

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        EmployeeANZ employeeANZ = (EmployeeANZ) obj;

        return id == employeeANZ.id && Long.compare(employeeANZ.salary, salary) == 0
                && Objects.equals(name, employeeANZ.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeANZ [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }


    
    

}
