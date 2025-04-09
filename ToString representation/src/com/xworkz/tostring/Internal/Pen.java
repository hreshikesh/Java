package com.xworkz.tostring.Internal;

public class Pen {
    private String brand;
    private String inkColor;
    private int price;

    public Pen(String brand, String inkColor, int price) {
        this.brand = brand;
        this.inkColor = inkColor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen brand " + this.brand + " ink color " + this.inkColor + " price " + this.price;
    }
}
