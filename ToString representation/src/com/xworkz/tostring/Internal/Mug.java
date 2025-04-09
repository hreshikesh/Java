package com.xworkz.tostring.Internal;

public class Mug {
    private String material;
    private String color;
    private int price;

    public Mug(String material, String color, int price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mug material: " + material + ", color: " + color + ", price: " + price;
    }
}