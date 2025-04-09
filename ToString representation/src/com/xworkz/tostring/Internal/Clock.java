package com.xworkz.tostring.Internal;

public class Clock {
    private String brand;
    private String style;
    private int price;

    public Clock(String brand, String style, int price) {
        this.brand = brand;
        this.style = style;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clock brand " + this.brand + " style " + this.style + " price " + this.price;
    }
}
