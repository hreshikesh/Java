package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.ExamRule;

public class Exam implements ExamRule {
    @Override
    public void examAuthority() {
        System.out.println("Exam authority is responsible for conducting the exam.");
    }

    @Override
    public void examSyllabus() {
        System.out.println("The syllabus for the exam is defined by the authority.");
    }

    @Override
    public void examPattern() {
        System.out.println("The exam pattern includes multiple-choice questions and descriptive questions.");
    }
}
