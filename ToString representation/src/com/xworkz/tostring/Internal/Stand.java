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
                Stand s1 = this;
                Stand s2 = (Stand) obj;
                if (s1.type.equals(s2.type) && s1.color.equals(s2.color)) {
                    System.out.println("Same type and color");
                    return true;
                }
            }
        }
        return false;
    }

}
