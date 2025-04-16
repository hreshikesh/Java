package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.CollegeRule;

public class Sdit implements CollegeRule {
    @Override
    public void maintainDiscipline() {
        System.out.println("Maintaining discipline in college");
    }

    @Override
    public void respectFaculty() {
        System.out.println("Respecting faculty members");
    }

    @Override
    public void participateInActivities() {
        System.out.println("Participating in college activities");
    }
}
