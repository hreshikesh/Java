package com.xworkz.isarelation.Internal;

public class Room {
    public Room() {
        System.out.println("Running no-arg constructor of Room");
    }

    public void openDoor() {
        System.out.println("Room door is opened");
    }

    public void closeDoor() {
        System.out.println("Room door is closed");
    }

    public void clean() {
        System.out.println("Room is being cleaned");
    }

    public void ventilate() {
        System.out.println("Room is being ventilated");
    }

    public void occupy() {
        System.out.println("Room is occupied");
    }
}
