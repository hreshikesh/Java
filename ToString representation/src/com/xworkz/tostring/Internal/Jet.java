package com.xworkz.tostring.Internal;

public class Jet {
    private String model;
    private int speed;
    private int capacity;

    public Jet(String model, int speed, int capacity) {
        this.model = model;
        this.speed = speed;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Jet model: " + this.model + ", speed: " + this.speed + " km/h, capacity: " + this.capacity + " passengers";
    }
}

