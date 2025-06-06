package com.xworkz.ToString.Internal;

public class Shoe {
    private String brand;
    private int size;
    private int price;

    public Shoe(String brand,int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoe brand " + this.brand + " Shoe size " + this.size + " Shoe price " + this.price;
    }
    @Override
    public int hashCode() {
        return -985258749;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Shoe) {
                Shoe shoe1 = this;
                Shoe shoe2 = (Shoe) obj;
                if (shoe1.size == shoe2.size) {
                    System.out.println("Same size");
                    return true;
                }
            }
        }
        return false;
    }
}
