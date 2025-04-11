package com.xworkz.tostring.Internal;

public class Scooter {
    private String brand;
    private String model;
    private int price;

    public Scooter(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Scooter brand " + this.brand + " model " + this.model + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return -982585;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Scooter) {
                Scooter s1 = this;
                Scooter s2 = (Scooter) obj;
                if (s1.price == s2.price) {
                    System.out.println("Same price");
                    return true;
                }
            }
        }
        return false;
    }

}
