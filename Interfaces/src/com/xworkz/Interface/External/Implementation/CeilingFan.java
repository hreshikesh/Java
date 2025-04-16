package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Fan;

public class CeilingFan implements Fan {


    @Override
    public void turnOn() {
        System.out.println("Ceiling fan is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Ceiling fan is turned off");

    }

    @Override
    public void rotate() {
        System.out.println("Ceiling fan is rotating");

    }
}
