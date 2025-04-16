package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Car;

public class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("Driving BMW");
    }

    @Override
    public void stop() {
        System.out.println("Stopping BMW");
    }

    @Override
    public void speedDrive() {
        System.out.println("Speed Driving BMW");
    }
}
