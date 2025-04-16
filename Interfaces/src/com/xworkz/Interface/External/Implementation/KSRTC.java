package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Bus;

public class KSRTC implements Bus {
    @Override
    public void startEngine() {
        System.out.println("KSRTC bus engine started");
    }

    @Override
    public void drive() {
        System.out.println("KSRTC bus is driving");
    }

    @Override
    public void stopEngine() {
        System.out.println("KSRTC bus engine stopped");
    }
}
