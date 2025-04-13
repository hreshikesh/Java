package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return 580;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Charger) {
                Charger charger1 = this;
                Charger charger2 = (Charger) obj;
                if (charger1.brand.equals(charger2.brand) &&
                        charger1.outputPower == charger2.outputPower &&
                        charger1.price == charger2.price) {
                    System.out.println("Same brand, outputPower and price");
                    return true;
                }
            }
        }
        return false;
    }



}
