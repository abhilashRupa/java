package com.nuvyra.learn.programming.interview.deloitte;

public class Student {

    private String firstName;
    private String lastName;
    private String location;
    private double grade;
    private int age;
    private String branch;

    
    public Student( String firstName, String lastName, String location, double grade, int age, String branch) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.grade = grade;
        this.age = age;
        this.branch = branch;
    }




    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public double getGrade() {
        return grade;
    }


    public void setGrade(double grade) {
        this.grade = grade;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getBranch() {
        return branch;
    }


    public void setBranch(String branch) {
        this.branch = branch;
    }




    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", location=" + location + ", grade="
                + grade + ", age=" + age + ", branch=" + branch + "]";
    }

    

}
