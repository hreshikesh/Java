package com.xworkz.ToString.Internal;

public class Torch {
    private String brand;
    private int lumens;
    private int price;

    public Torch(String brand, int lumens, int price) {
        this.brand = brand;
        this.lumens = lumens;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Torch brand " + this.brand + " lumens " + this.lumens + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return -21;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Torch) {
                Torch torch1 = this;
                Torch torch2 = (Torch) obj;
                if (torch1.brand.equals(torch2.brand) && torch1.lumens == torch2.lumens) {
                    System.out.println("Same brand and lumens");
                    return true;
                }
            }
        }
        return false;
    }

}
