package com.xworkz.isarelation.Internal;

public class Car extends Vehicle {
    public Car() {
        System.out.println("no args const of car");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public void start() {
        System.out.println("Vehicle started in subclass");
    }
    @Override
    public void stop() {
        System.out.println("Vehicle stopped in subclass");
    }
    @Override
    public void accelerate() {
        System.out.println("Vehicle accelerating in subclass");
    }
    @Override
    public void brake() {
        System.out.println("Vehicle braking in subclass");
    }
}
