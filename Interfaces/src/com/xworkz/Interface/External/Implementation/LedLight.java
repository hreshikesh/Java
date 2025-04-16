package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Light;

public class LedLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("LED light is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("LED light is turned off");
    }

    @Override
    public void dim() {
        System.out.println("LED light is dimmed");
    }
}
