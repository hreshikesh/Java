package com.xworkz.tostring.Internal;

public class Wire {
    private String material;
    private int length;
    private String color;

    public Wire(String material, int length, String color) {
        this.material = material;
        this.length = length;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wire material: " + material + ", length: " + length + " meters, color: " + color;
    }
}
