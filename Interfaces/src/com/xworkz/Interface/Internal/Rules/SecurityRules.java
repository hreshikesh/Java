package com.xworkz.Interface.Internal.Rules;

public interface SecurityRules {
    void lockDoors();
    void setAlarm();
    void checkWindows();

    default void securityInfo() {
        System.out.println("Security information");
    }
}
