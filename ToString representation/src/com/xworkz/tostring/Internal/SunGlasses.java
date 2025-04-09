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
}
