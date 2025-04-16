package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Camera;
import com.xworkz.Interface.Internal.Rules.SecurityRules;

public class Survelliance implements SecurityRules, Camera {

    @Override
    public void takePhoto() {
        System.out.println("Survelliance takePhoto is important");
    }

    @Override
    public void recordVideo() {
        System.out.println("Survelliance recordVideo is important");

    }

    @Override
    public void filter() {
        System.out.println("Survelliance filter is important");

    }

    @Override
    public void lockDoors() {
        System.out.println("Survelliance lockDoors is important");

    }

    @Override
    public void setAlarm() {
        System.out.println("Survelliance setAlarm is important");

    }

    @Override
    public void checkWindows() {
        System.out.println("Survelliance checkWindows is important");

    }
}
