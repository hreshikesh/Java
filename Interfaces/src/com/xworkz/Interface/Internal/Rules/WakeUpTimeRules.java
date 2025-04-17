package com.xworkz.Interface.Internal.Rules;

public interface WakeUpTimeRules {
    void wakeUp();
    void checkTime();
    void resetAlarm();

    default void wakeUpInfo() {
        System.out.println("Wake up information");
    }
}
