package com.xworkz.tostring.Internal;

public class Shampoo {
    private String brand;
    private int volume;
    private String fragrance;

    public Shampoo(String brand, int volume, String fragrance) {
        this.brand = brand;
        this.volume = volume;
        this.fragrance = fragrance;
    }

    @Override
    public String toString() {
        return "Shampoo brand: " + brand + ", volume: " + volume + "ml, fragrance: " + fragrance;
    }
}
