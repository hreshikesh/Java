package com.xworkz.isarelation.Internal;

public class Jet extends Airplane {
    public Jet() {
        System.out.println("Running no-arg constructor of Jet");
    }
    @Override
    public void takeOff() {
        System.out.println("Airplane is taking off in subclass");
    }
    @Override
    public void fly() {
        System.out.println("Airplane is flying in the sky in subclass");
    }
    @Override
    public void land() {
        System.out.println("Airplane is landing in subclass");
    }
    @Override
    public void fuelCapacity() {
        System.out.println("Airplane has a large fuel capacity in subclass");
    }
    @Override
    public void passengers() {
        System.out.println("Airplane carries passengers in subclass");
    }
}
