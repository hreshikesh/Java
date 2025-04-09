package com.xworkz.tostring.Internal;

public class Mobile {
    private String brand;
    private String model;
    private int price;

    public Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile brand " + this.brand + " model " + this.model + " battery " + this.price ;
    }
}
