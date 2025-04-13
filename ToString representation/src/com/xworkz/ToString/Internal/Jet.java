package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return -789;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Jet) {
                Jet jet1 = this;
                Jet jet2 = (Jet) obj;
                if (jet1.model.equals(jet2.model) &&
                        jet1.speed == jet2.speed &&
                        jet1.capacity == jet2.capacity) {
                    System.out.println("Same model, speed, and capacity");
                    return true;
                }
            }
        }
        return false;
    }

}

