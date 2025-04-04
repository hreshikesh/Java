package com.xworkz.isarelation.Internal;

public class SkyBag extends Bag {
    public SkyBag() {
        System.out.println("no args const of SkyBag");
    }
    @Override
    public void zip() {
        System.out.println("Running Zip in subclass");
    }
    @Override
    public void unzip() {
        System.out.println("Running unzip in subclass");
    }
    @Override
    public void carry() {
        System.out.println("Running Carry in subclass");
    }
    @Override
    public void pouches() {
        System.out.println("Running Pouches in subclass");
    }
    @Override
    public void size() {
        System.out.println("Running size in subclass");
    }
}
