package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.SmartWatch;

public class AppleWatch implements SmartWatch {
    @Override
    public void trackSteps() {
        System.out.println("Tracking steps with Apple Watch");
    }

    @Override
    public void displayTime() {
        System.out.println("Displaying time on Apple Watch");
    }

    @Override
    public void checkHeartRate() {
        System.out.println("Checking heart rate with Apple Watch");
    }
}
