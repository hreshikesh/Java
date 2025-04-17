package com.xworkz.Interface.Internal.Rules;

public interface HomeRule {
    void lockDoors();

    void setAlarm();

    void checkWindows();

    default void homeInfo() {
        System.out.println("Home information");
    }


}
