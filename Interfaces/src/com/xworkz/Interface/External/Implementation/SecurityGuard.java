package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.SecurityRules;

public class SecurityGuard implements SecurityRules {
    @Override
    public void lockDoors() {
        System.out.println("Security guard is locking the doors");
    }

    @Override
    public void setAlarm() {
        System.out.println("Security guard is setting the alarm");
    }

    @Override
    public void checkWindows() {
        System.out.println("Security guard is checking the windows");
    }
}
