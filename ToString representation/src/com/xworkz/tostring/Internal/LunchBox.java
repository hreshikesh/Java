package com.xworkz.tostring.Internal;

public class LunchBox {
    private String brand;
    private int containers;
    private int price;

    public LunchBox(String brand, int containers, int price) {
        this.brand = brand;
        this.containers = containers;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LunchBox brand: " + brand + ", containers: " + containers + ", price: " + price;
    }
}
