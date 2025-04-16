package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.SmartPhone;
import com.xworkz.Interface.Internal.Rules.SmartWatch;

public class SmartDevice implements SmartPhone, SmartWatch {

    @Override
    public void makeCall() {
        System.out.println("SmartDevice makeCall is important");

    }

    @Override
    public void sendMessage() {
        System.out.println("SmartDevice sendMessage is important");

    }

    @Override
    public void browse() {
        System.out.println("SmartDevice browse is important");

    }

    @Override
    public void trackSteps() {
        System.out.println("SmartDevice trackSteps is important");

    }

    @Override
    public void displayTime() {
        System.out.println("SmartDevice displayTime is important");

    }

    @Override
    public void checkHeartRate() {
        System.out.println("SmartDevice checkHeartRate is important");

    }
}
