package com.xworkz.tostring.Internal;

public class Fridge {
    private String brand;
    private int capacity;
    private int price;

    public Fridge(String brand, int capacity, int price) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fridge brand " + this.brand + " capacity " + this.capacity + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return -9;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Fridge) {
                Fridge fridge1 = this;
                Fridge fridge2 = (Fridge) obj;
                if (fridge1.brand.equals(fridge2.brand) && fridge1.capacity == fridge2.capacity) {
                    System.out.println("Same brand and capacity");
                    return true;
                }
            }
        }
        return false;
    }



}
