package com.xworkz.tostring.Internal;

public class Shoe {
    private String brand;
    private int size;
    private int price;

    public Shoe(String brand,int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoe brand " + this.brand + " Shoe size " + this.size + " Shoe price " + this.price;
    }
}
