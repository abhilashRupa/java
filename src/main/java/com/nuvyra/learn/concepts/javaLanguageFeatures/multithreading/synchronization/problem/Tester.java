package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.synchronization.problem;
class Course1 {
    String courseName;
    int numOfSeats;
    public Course1(String courseName, int numOfSeats) {
        this.courseName = courseName;
        this.numOfSeats = numOfSeats;
    }
    public void registerForCourse(int rollNo) {
        try {
            if(this.numOfSeats - 1 < 0) {
                throw new Exception("No more seats available for this course");
            }
            System.out.println("Booking successful!");
            this.numOfSeats -= 1;
            System.out.println("Available seats: " + this.numOfSeats);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class RegisterThread1 extends Thread {
    Course1 c;

    RegisterThread1(Course1 c) {
        this.c = c;
    }
    @Override
    public void run() {
        c.registerForCourse(1);
    }
}

class Tester
{
    public static void main(String[] args) {
        Course1 cse = new Course1("CSE", 1);
        RegisterThread1 regObj1 = new RegisterThread1(cse);
        regObj1.start();
        RegisterThread1 regObj2 = new RegisterThread1(cse);
        regObj2.start();
    }
}