package com.xworkz.tostring.Internal;

public class Pencil {
    private String brand;
    private String type; // e.g., HB, 2B, etc.
    private int price;

    public Pencil(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pencil brand " + this.brand + " type " + this.type + " price " + this.price;
    }
}
