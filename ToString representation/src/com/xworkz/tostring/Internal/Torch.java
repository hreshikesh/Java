package com.xworkz.tostring.Internal;

public class Torch {
    private String brand;
    private int lumens;
    private int price;

    public Torch(String brand, int lumens, int price) {
        this.brand = brand;
        this.lumens = lumens;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Torch brand " + this.brand + " lumens " + this.lumens + " price " + this.price;
    }
}
