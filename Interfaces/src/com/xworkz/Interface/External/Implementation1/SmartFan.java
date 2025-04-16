package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Fan;
import com.xworkz.Interface.Internal.Rules.HomeRule;

public class SmartFan implements Fan, HomeRule {

    @Override
    public void turnOn() {
        System.out.println("SmartFan turnOn is important");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartFan turnOff is important");

    }

    @Override
    public void rotate() {
        System.out.println("SmartFan rotate is important");

    }

    @Override
    public void lockDoors() {
        System.out.println("SmartFan lockDoors is important");

    }

    @Override
    public void setAlarm() {
        System.out.println("SmartFan setAlarm is important");

    }

    @Override
    public void checkWindows() {
        System.out.println("SmartFan checkWindows is important");
    }
}
