package com.xworkz.isarelation.Internal;

public class Bathroom extends Room {
    public Bathroom() {
        System.out.println("Running no-arg constructor of Bathroom");
    }
    @Override
    public void openDoor() {
        System.out.println("Room door is opened in subclass");
    }
    @Override
    public void closeDoor() {
        System.out.println("Room door is closed in subclass");
    }
    @Override
    public void clean() {
        System.out.println("Room is being cleanedin subclass");
    }
    @Override
    public void ventilate() {
        System.out.println("Room is being ventilated in subclass");
    }
    @Override
    public void occupy() {
        System.out.println("Room is occupied in subclass");
    }
}
