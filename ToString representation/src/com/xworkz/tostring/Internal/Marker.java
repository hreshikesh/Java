package com.xworkz.tostring.Internal;

public class Marker {
    private String color;
    private String brand;
    private int price;

    public Marker(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Marker color: " + color + ", brand: " + brand + ", price: " + price;
    }


}
