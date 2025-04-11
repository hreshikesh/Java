package com.xworkz.tostring.Internal;

public class Clock {
    private String brand;
    private String style;
    private int price;

    public Clock(String brand, String style, int price) {
        this.brand = brand;
        this.style = style;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clock brand " + this.brand + " style " + this.style + " price " + this.price;
    }

    @Override

    public int hashCode() {
        return 55700;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Clock) {
                Clock clock1 = this;
                Clock clock2 = (Clock) obj;
                if (clock1.brand.equals(clock2.brand) && clock1.style.equals(clock2.style)) {
                    System.out.println("Same brand and style");
                    return true;
                }
            }
        }
        return false;
    }

}
