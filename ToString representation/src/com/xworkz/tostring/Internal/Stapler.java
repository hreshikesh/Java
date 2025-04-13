package com.xworkz.tostring.Internal;

public class Stapler {
    private String brand;
    private int pinsCapacity;
    private int price;

    public Stapler(String brand, int pinsCapacity, int price) {
        this.brand = brand;
        this.pinsCapacity = pinsCapacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stapler brand: " + brand + ", pinsCapacity: " + pinsCapacity + ", price: " + price;
    }
    @Override
    public int hashCode() {
        return 8888;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Stapler) {
                Stapler stapler1 = this;
                Stapler stapler2 = (Stapler) obj;
                if (stapler1.brand.equals(stapler2.brand) &&
                        stapler1.pinsCapacity == stapler2.pinsCapacity &&
                        stapler1.price == stapler2.price) {
                    System.out.println("Same brand, pinsCapacity and price");
                    return true;
                }
            }
        }
        return false;
    }


}
