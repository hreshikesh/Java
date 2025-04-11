package com.xworkz.tostring.Internal;

public class KeyBoard {
    private String brand;
    private int noOfKeys;
    private int price;

    public KeyBoard(String brand, int noOfKeys, int price) {
        this.brand = brand;
        this.noOfKeys = noOfKeys ;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard brand " + this.brand + " noofKeys " + this.noOfKeys + " price " + this.price ;
    }
    @Override
    public int hashCode() {
        return -7895;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof KeyBoard) {
                KeyBoard k1 = this;
                KeyBoard k2 = (KeyBoard) obj;
                if (k1.noOfKeys == k2.noOfKeys) {
                    System.out.println("Same number of keys");
                    return true;
                }
            }
        }
        return false;
    }
}
