package com.xworkz.tostring.Internal;

public class Adapter {
    private  String brand;
    private int wattage;
    private int price;

    public Adapter(String brand, int wattage, int price) {
        this.brand = brand;
        this.wattage = wattage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Adapter brand: " + this.brand + ", wattage: " + this.wattage + "W, price: " + this.price;
    }
}
