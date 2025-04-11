package com.xworkz.tostring.Internal;

public class Watch {
    private String brand;
    private String style;
    private int price;
     public Watch(String brand, String style, int price) {
        this.brand = brand;
        this.style = style;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Watch brand " + this.brand + " style " + this.style + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return -1;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Watch) {
                Watch w1 = this;
                Watch w2 = (Watch) obj;
                if (w1.brand.equals(w2.brand) && w1.price == w2.price) {
                    System.out.println("Same brand and price");
                    return true;
                }
            }
        }
        return false;
    }
}
