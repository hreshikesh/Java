package com.xworkz.ToString.Internal;

public class Pen {
    private String brand;
    private String inkColor;
    private int price;

    public Pen(String brand, String inkColor, int price) {
        this.brand = brand;
        this.inkColor = inkColor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen brand " + this.brand + " ink color " + this.inkColor + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return -897;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Pen) {
                Pen pen1 = this;
                Pen pen2 = (Pen) obj;
                if (pen1.brand.equals(pen2.brand) && pen1.inkColor.equals(pen2.inkColor)) {
                    System.out.println("Same brand and ink color");
                    return true;
                }
            }
        }
        return false;
    }

}
