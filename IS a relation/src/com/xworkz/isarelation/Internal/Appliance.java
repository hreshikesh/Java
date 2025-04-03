package com.xworkz.isarelation.Internal;

public class Appliance {
    public Appliance() {
        System.out.println("Running no-arg constructor of Appliance");
    }

    public void turnOn() {
        System.out.println("Appliance is turning on");
    }

    public void turnOff() {
        System.out.println("Appliance is turning off");
    }

    public void consumeElectricity() {
        System.out.println("Appliance is consuming electricity");
    }

    public void maintain() {
        System.out.println("Appliance requires maintenance");
    }

    public void warrantyPeriod() {
        System.out.println("Checking warranty period of appliance");
    }

}
