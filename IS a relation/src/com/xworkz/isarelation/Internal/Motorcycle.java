package com.xworkz.isarelation.Internal;

public class Motorcycle extends Cycle{
    public Motorcycle() {
        System.out.println("Running no-arg constructor of Motorcycle");
    }
    @Override
    public void pedal() {
        System.out.println("Cycle moves by pedaling in subclass");
    }
    @Override
    public void brake() {
        System.out.println("Cycle has brakes in subclass");
    }
    @Override
    public void wheels() {
        System.out.println("Cycle has two wheels in subclass");
    }
    @Override
    public void ringBell() {
        System.out.println("Cycle has a bell in subclass");
    }
    @Override
    public void stand() {
        System.out.println("Cycle has a side stand in subclass");
    }

}
