package com.xworkz.isarelation.Internal;

public class Tablet extends Medicine {
    public Tablet() {
        System.out.println("Running no-arg constructor of Tablet");
    }
    @Override
    public void cure() {
        System.out.println("Running cure in subclass");
    }
    @Override
    public void dosage() {
        System.out.println("Running dosage in subclass");
    }
    @Override
    public void store() {
        System.out.println("Running store in subclass");
    }
    @Override
    public void manufacture() {
        System.out.println("Running manufacture in subclass");
    }
    @Override
    public void expiryDate() {
        System.out.println("Running expiryDate in subclass");
    }

    public void overDose(){
        System.out.println("Running OverDose in Tablet");
    }
}
