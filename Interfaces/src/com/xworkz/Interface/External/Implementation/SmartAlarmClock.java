package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.WakeUpTimeRules;

public class SmartAlarmClock implements WakeUpTimeRules {
    @Override
    public void wakeUp() {
        System.out.println("Waking up at the set time.");
    }

    @Override
    public void checkTime() {
        System.out.println("Checking the current time.");
    }

    @Override
    public void resetAlarm() {
        System.out.println("Resetting the alarm to a new time.");
    }
}
