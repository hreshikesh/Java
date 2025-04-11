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
    @Override
    public int hashCode() {
        return -148985;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Wallet) {
                Wallet wallet1 = this;
                Wallet wallet2 = (Wallet) obj;
                if (wallet1.brand.equals(wallet2.brand) && wallet1.material.equals(wallet2.material)) {
                    System.out.println("Same brand and material");
                    return false;
                }
            }
        }
        return false;
    }

}
