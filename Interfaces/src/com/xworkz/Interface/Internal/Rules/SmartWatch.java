package com.xworkz.Interface.Internal.Rules;

public interface SmartWatch {
    void trackSteps();
    void displayTime();
    void checkHeartRate();

    default void watchInfo() {
        System.out.println("Smartwatch information");
    }
}
