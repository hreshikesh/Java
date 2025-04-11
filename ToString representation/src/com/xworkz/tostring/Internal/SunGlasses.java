package com.xworkz.tostring.Internal;

public class SunGlasses {
    private String brand;
    private String frameColor;
    private int price;

    public SunGlasses(String brand, String frameColor, int price) {
        this.brand = brand;
        this.frameColor = frameColor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sunglasses brand " + this.brand + " frame color " + this.frameColor + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return 2004;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof SunGlasses) {
                SunGlasses s1 = this;
                SunGlasses s2 = (SunGlasses) obj;
                if (s1.price == s2.price) {
                    System.out.println("Same price");
                    return true;
                }
            }
        }
        return false;
    }

}
