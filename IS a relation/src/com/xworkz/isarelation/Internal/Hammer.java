package com.xworkz.isarelation.Internal;

public class Hammer extends Tool{
    public Hammer() {
        System.out.println("Running no-arg constructor of Hammer");
    }
    @Override
    public void use() {
        System.out.println("Using the tool in subclass");
    }
    @Override
    public void maintain() {
        System.out.println("Maintaining the tool in subclass");
    }
    @Override
    public void store() {
        System.out.println("Storing the tool in subclass");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning the tool in subclass");
    }
    @Override
    public void repair() {
        System.out.println("Repairing the tool in subclass");
    }
}
