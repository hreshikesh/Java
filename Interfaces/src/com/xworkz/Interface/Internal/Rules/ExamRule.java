package com.xworkz.Interface.Internal.Rules;

public interface ExamRule {
    void examAuthority();

    void examSyllabus();

    void examPattern();

    default void examInfo() {
        System.out.println("Exam information");
    }



}
