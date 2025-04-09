package com.xworkz.tostring.Internal;

public class Helmet {
    private String brand;
    private String size;
    private String color;

    public Helmet(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Helmet brand: " + brand + ", size: " + size + ", color: " + color;
    }
}
