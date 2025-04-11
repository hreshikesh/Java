package com.xworkz.tostring.Internal;

public class Belt {
    private String material;
    private String size;
    private int price;

    public Belt(String material, String size, int price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Belt material " + this.material + " size " + this.size + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return 150;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Belt) {
                Belt belt1 = this;
                Belt belt2 = (Belt) obj;
                if (belt1.material.equals(belt2.material) && belt1.size.equals(belt2.size)) {
                    System.out.println("Same material and size");
                    return true;
                }
            }
        }
        return false;
    }

}
