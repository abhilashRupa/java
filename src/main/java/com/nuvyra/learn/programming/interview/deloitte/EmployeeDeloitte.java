package com.nuvyra.learn.programming.interview.deloitte;

public class EmployeeDeloitte {

    private String name;
    private Integer age;


    public EmployeeDeloitte(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "EmployeeDeloitte [name=" + name + ", age=" + age + "]";
    }

    

}
