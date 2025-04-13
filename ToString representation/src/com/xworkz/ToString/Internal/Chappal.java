package com.xworkz.ToString.Internal;

public class Chappal {
    private String brand;
    private String size;
    private int price;

    public Chappal(String brand, String size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chappla brand " + this.brand + " size " + this.size + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return 507;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Chappal) {
                Chappal chappal1 = this;
                Chappal chappal2 = (Chappal) obj;
                if (chappal1.brand.equals(chappal2.brand) && chappal1.size.equals(chappal2.size)) {
                    System.out.println("Same brand and size");
                    return true;
                }
            }
        }
        return false;
    }

}
