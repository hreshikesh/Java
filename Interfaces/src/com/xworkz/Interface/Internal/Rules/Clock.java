package com.xworkz.Interface.Internal.Rules;

public interface Clock {
    void showTime();
    void setAlarm();
    void tick();

    default void clockInfo() {
        System.out.println("Clock information");
    }
}
