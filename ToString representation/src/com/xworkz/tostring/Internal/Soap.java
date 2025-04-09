package com.xworkz.tostring.Internal;

public class Soap {
    private String brand;
    private String type;
    private int price;

    public Soap(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Soap brand " + this.brand + " type " + this.type + " price " + this.price;
    }
}
