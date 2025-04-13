package com.xworkz.tostring.Internal;

public class Stand {
    private String type;
    private String color;
    private int price;

    public Stand(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stand type " + this.type + " color " + this.color + " price ₹" + this.price;
    }
    @Override
    public int hashCode() {
        return -777777;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Stand) {
                Stand stand1 = this;
                Stand stand2 = (Stand) obj;
                if (stand1.type.equals(stand2.type) && stand1.color.equals(stand2.color)) {
                    System.out.println("Same type and color");
                    return true;
                }
            }
        }
        return false;
    }

}
