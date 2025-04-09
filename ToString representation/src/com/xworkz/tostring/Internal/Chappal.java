package com.xworkz.tostring.Internal;

public class Chappal {
    private String brand;
    private String size;
    private int price;

    public Chappal(String brand, String size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chappla brand " + this.brand + " size " + this.size + " price " + this.price;
    }
}
