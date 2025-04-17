package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating");
    }

    @Override
    public void vehicleInfo() {
        System.out.println("This is a bike, a two-wheeled motor vehicle.");
    }

}
