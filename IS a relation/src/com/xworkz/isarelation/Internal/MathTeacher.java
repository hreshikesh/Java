package com.xworkz.isarelation.Internal;

public class MathTeacher extends Teacher {
    public MathTeacher() {
        System.out.println("Running no-arg constructor of MathTeacher");
    }
    @Override
    public void teach() {
        System.out.println("Running teach in subclass");
    }
    @Override
    public void evaluate() {
        System.out.println("Running evaluate in subclass");
    }
    @Override
    public void assignHomework() {
        System.out.println("Running assignHomework in subclass");
    }
    @Override
    public void conductExam() {
        System.out.println("Running conductExam in subclass");
    }
    @Override
    public void guideStudents() {
        System.out.println("Running guideStudents in subclass");
    }
}
