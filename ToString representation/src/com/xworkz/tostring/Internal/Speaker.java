package com.xworkz.tostring.Internal;

public class Speaker {
    private String brand;
    private String type;
    private int price;
    public Speaker(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Speaker brand " + this.brand + " type " + this.type + " price " + this.price;
    }
}
