package com.xworkz.tostring.Internal;

public class Socks {
    private String brand;
    private String color;
    private int price;

    public Socks(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Socks brand " + this.brand + " color " + this.color + " price " + this.price;
    }
}
