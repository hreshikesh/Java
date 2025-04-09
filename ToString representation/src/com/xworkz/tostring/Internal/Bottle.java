package com.xworkz.tostring.Internal;

public class Bottle {

    private String brand;
    private String color;
    private int capacity;

    public Bottle(String brand, String color, int capacity) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bottle brand " + this.brand + " color " + this.color + " capacity " + this.capacity ;
    }

}
