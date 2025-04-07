package com.xworkz.isarelation.Internal;

public class WashingMachine extends Appliance {
    public WashingMachine() {
        System.out.println("Running no-arg constructor of WashingMachine");
    }
    @Override
    public void turnOn() {
        System.out.println("Appliance is turning on in subclass");
    }
    @Override
    public void turnOff() {
        System.out.println("Appliance is turning off in subclass");
    }
    @Override
    public void consumeElectricity() {
        System.out.println("Appliance is consuming electricity in subclass");
    }
    @Override
    public void maintain() {
        System.out.println("Appliance requires maintenance in subclass");
    }
    @Override
    public void warrantyPeriod() {
        System.out.println("Checking warranty period of appliance in subclass");
    }

    public void machineCost(){
        System.out.println("Running Machine Cost in Washinmachine");
    }
}
