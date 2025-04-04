package com.xworkz.isarelation.Internal;

public class WoodenDoor extends Door{
    public WoodenDoor() {
        System.out.println("Running no-arg constructor of WoodenDoor");
    }
    @Override
    public void open() {
        System.out.println("Door is opening in subclass");
    }
    @Override
    public void close() {
        System.out.println("Door is closing in subclass");
    }
    @Override
    public void lock() {
        System.out.println("Door is locked in subclass");
    }
    @Override
    public void unlock() {
        System.out.println("Door is unlocked in subclass");
    }
    @Override
    public void material() {
        System.out.println("Door can be made of different materials in subclass");
    }
}
