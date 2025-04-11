package com.xworkz.tostring.Internal;

public class Bottle {

    private String brand;
    private String color;
    private int capacity;

    public Bottle(String brand, String color, int capacity) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bottle brand " + this.brand + " color " + this.color + " capacity " + this.capacity ;
    }
    @Override
    public int hashCode() {
        return 15;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Bottle) {
                Bottle b1 = this;
                Bottle b2 = (Bottle) obj;
                if (b1.capacity == b2.capacity) {
                    System.out.println("Same capacity");
                    return true;
                }
            }
        }
        return false;
    }


}
