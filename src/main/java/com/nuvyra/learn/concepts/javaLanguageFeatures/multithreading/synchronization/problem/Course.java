package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.synchronization.problem;

public class Course {

    String courseName;
    int numberOfSeats;

    public Course(String courseName, int numberOfSeats) {
        this.courseName = courseName;
        this.numberOfSeats = numberOfSeats;
    }

    public void registerForCourse(int rollNo) {
        try{
            if(this.numberOfSeats -1 < 0){
                throw new Exception("No more seats available for this course");
            }
            System.out.println("Booked successfully");
            this.numberOfSeats -= 1;
            System.out.println("Available seats: "+this.numberOfSeats);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());

        }

    }

}
