package com.xworkz.Interface.Internal.Rules;

public interface CollegeRule {

    void maintainDiscipline();

    void respectFaculty();

    void participateInActivities();

    default void collegeInfo() {
        System.out.println("College information");
    }

}
