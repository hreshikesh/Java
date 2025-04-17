package com.xworkz.Interface.Internal.Rules;

public interface SchoolRule {
    void attendClasses();

    void doHomework();

    void followDressCode();

    default void schoolInfo() {
        System.out.println("School information");
    }


}
