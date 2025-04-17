package com.xworkz.Interface.Internal.Rules;

public interface Bed {
    void sleep();
    void takeNap();
    void relax();
    default void bedInfo() {
        System.out.println("Bed information");
    }
}
