package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.HomeRule;

public class Father implements HomeRule {
    @Override
    public void lockDoors() {
        System.out.println("Locking the doors");
    }

    @Override
    public void setAlarm() {
        System.out.println("Setting the alarm");
    }

    @Override
    public void checkWindows() {
        System.out.println("Checking the windows");
    }
}
