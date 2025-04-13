package com.xworkz.ToString.Internal;

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
                Watch watch1 = this;
                Watch watch2 = (Watch) obj;
                if (watch1.brand.equals(watch2.brand) && watch1.price == watch2.price) {
                    System.out.println("Same brand and price");
                    return true;
                }
            }
        }
        return false;
    }
}
