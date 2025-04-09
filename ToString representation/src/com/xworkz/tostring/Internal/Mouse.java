package com.xworkz.tostring.Internal;

public class Mouse {
    private String brand;
    private String type;
    private int price;

    public Mouse(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mouse brand " + this.brand + " type " + this.type + " price " + this.price;
    }
}
