package com.xworkz.tostring.Internal;

public class Stand {
    private String type;
    private String color;
    private int price;

    public Stand(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stand type " + this.type + " color " + this.color + " price ₹" + this.price;
    }
}
