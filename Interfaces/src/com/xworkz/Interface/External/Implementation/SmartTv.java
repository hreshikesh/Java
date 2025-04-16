package com.xworkz.Interface.External.Implementation;
import com.xworkz.Interface.Internal.Rules.TV;
public class SmartTv implements TV{

    @Override
    public void turnOn() {
        System.out.println("Turning on the Smart TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the Smart TV");

    }

    @Override
    public void changeChannel() {
        System.out.println("Changing channel on the Smart TV");

    }
}
