package com.xworkz.tostring.Internal;

public class Socks {
    private String brand;
    private String color;
    private int price;

    public Socks(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Socks brand " + this.brand + " color " + this.color + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return 785;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Socks) {
                Socks socks1 = this;
                Socks socks2 = (Socks) obj;
                if (socks1.brand.equals(socks2.brand) && socks1.color.equals(socks2.color)) {
                    System.out.println("Same brand and color");
                    return true;
                }
            }
        }
        return false;
    }

}
