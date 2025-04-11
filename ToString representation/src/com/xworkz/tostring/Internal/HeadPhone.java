package com.xworkz.tostring.Internal;

public class HeadPhone {
    private String brand;
    private String type;
    private int price;
    public HeadPhone(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Headphones brand " + this.brand + " type " + this.type + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return 69;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof HeadPhone) {
                HeadPhone headPhone1 = this;
                HeadPhone headPhone2 = (HeadPhone) obj;
                if (headPhone1.brand.equals(headPhone2.brand) && headPhone1.price == headPhone2.price) {
                    System.out.println("Same brand and price");
                    return true;
                }
            }
        }
        return false;
    }

}
