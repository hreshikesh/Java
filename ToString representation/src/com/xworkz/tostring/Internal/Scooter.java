package com.xworkz.tostring.Internal;

public class Scooter {
    private String brand;
    private String model;
    private int price;

    public Scooter(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Scooter brand " + this.brand + " model " + this.model + " price " + this.price;
    }
}
