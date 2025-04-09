package com.xworkz.tostring.Internal;

public class Cap {
    private String color;
    private String brand;
    private int price;

    public Cap(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cap color: " + color + ", brand: " + brand + ", price: " + price;
    }


}
