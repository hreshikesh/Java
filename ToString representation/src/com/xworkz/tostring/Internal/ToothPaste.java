package com.xworkz.tostring.Internal;

public class ToothPaste {
    private String brand;
    private String flavor;
    private int price;

    public ToothPaste(String brand, String flavor, int price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toothpaste brand " + this.brand + " flavor " + this.flavor + " price " + this.price;
    }
}
