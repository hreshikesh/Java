package com.xworkz.tostring.Internal;

public class Guitar {
    private String type;
    private String brand;
    private int price;

    public Guitar(String type, String brand, int price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Guitar type: " + type + ", brand: " + brand + ", price: " + price;
    }
}