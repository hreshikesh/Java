package com.xworkz.isarelation.Internal;

public class Student extends School {
    public Student() {
        System.out.println("Running no-arg constructor of Student");
    }
    @Override
    public void study() {
        System.out.println("Students are studying in subclass");
    }
    @Override
    public void exam() {
        System.out.println("Students are giving exams in subclass");
    }
    @Override
    public void play() {
        System.out.println("Students are playing in subclass");
    }
    @Override
    public void lunchBreak() {
        System.out.println("Lunch break in school in subclass");
    }
    @Override
    public void teacherMeeting() {
        System.out.println("Teachers are in a meeting in subclass");
    }

    public void homework(){
        System.out.println("Running homework in student");
    }

}
