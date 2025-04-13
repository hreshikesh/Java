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
    @Override
    public int hashCode() {
        return -100;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Wire) {
                Wire wire = this;
                Wire wire1 = (Wire) obj;
                if (wire.material.equals(wire1.material) && wire.length == wire1.length && wire.color.equals(wire1.color)) {
                    System.out.println("Same material, length, and color");
                    return true;
                }
            }
        }
        return false;
    }

}
