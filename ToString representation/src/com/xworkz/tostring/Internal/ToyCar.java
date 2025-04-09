package com.xworkz.tostring.Internal;

public class ToyCar {
    private String color;
    private String brand;
    private int price;

    public ToyCar(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ToyCar color: " + color + ", brand: " + brand + ", price: " + price;
    }

}
