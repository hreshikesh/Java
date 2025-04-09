package com.xworkz.tostring.Internal;

public class Wallet {
    private String brand;
    private String material;
    private int price;

    public Wallet(String brand, String material, int price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wallet brand " + this.brand + " material " + this.material + " price " + this.price;
    }
}
