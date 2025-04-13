package com.xworkz.ToString.Internal;

public class Lamp {
    private String type;
    private String color;
    private int price;

    public Lamp(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lamp type " + this.type + " color " + this.color + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return -8;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Lamp) {
                Lamp lamp1 = this;
                Lamp lamp2 = (Lamp) obj;
                if (lamp1.color.equals(lamp2.color)) {
                    System.out.println("Same color");
                    return true;
                }
            }
        }
        return false;
    }

}
