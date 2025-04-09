package com.xworkz.tostring.Internal;

public class Dustbin {
    private String material;
    private int capacity;
    private String color;

    public Dustbin(String material, int capacity, String color) {
        this.material = material;
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dustbin material: " + material + ", capacity: " + capacity + "L, color: " + color;
    }
}
