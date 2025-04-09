package com.xworkz.tostring.Internal;

public class IronBox {

    private String brand;
    private int wattage;
    private int price;

    public IronBox(String brand, int wattage, int price) {
        this.brand = brand;
        this.wattage = wattage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "IronBox brand " + this.brand + " wattage " + this.wattage + " price " + this.price;
    }
}
