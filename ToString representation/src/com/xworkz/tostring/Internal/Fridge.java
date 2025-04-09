package com.xworkz.tostring.Internal;

public class Fridge {
    private String brand;
    private int capacity;
    private int price;

    public Fridge(String brand, int capacity, int price) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fridge brand " + this.brand + " capacity " + this.capacity + " price " + this.price;
    }

}
