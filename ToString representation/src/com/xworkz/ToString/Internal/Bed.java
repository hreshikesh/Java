package com.xworkz.ToString.Internal;

public class Bed {
    private String type;
    private String material;
    private int price;

    public Bed(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bed type " + this.type + " material " + this.material + " price " + this.price;
    }

    @Override
    public int hashCode() {
        return 1000;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Bed) {
                Bed b1 = this;
                Bed b2 = (Bed) obj;
                if (b1.price == b2.price) {
                    System.out.println("Same price");
                    return true;
                }
            }

        }
        return false;
    }
}

