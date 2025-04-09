package com.xworkz.tostring.Internal;

public class Charger {
    private String brand;
    private int outputPower;
    private int price;

    public Charger(String brand, int outputPower, int price) {
        this.brand = brand;
        this.outputPower = outputPower;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Charger brand: " + brand + ", output power: " + outputPower + "W, price: " + price;
    }


}
