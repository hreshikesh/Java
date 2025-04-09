package com.xworkz.tostring.Internal;

public class Mixer {
    private String brand;
    private int jars;
    private int price;

    public Mixer(String brand, int jars, int price) {
        this.brand = brand;
        this.jars = jars;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mixer brand: " + brand + ", jars: " + jars + ", price: " + price;
    }

}
