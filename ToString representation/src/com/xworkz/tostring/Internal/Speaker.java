package com.xworkz.tostring.Internal;

public class Speaker {
    private String brand;
    private String type;
    private int price;
    public Speaker(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Speaker brand " + this.brand + " type " + this.type + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return -14;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Speaker) {
                Speaker speaker1 = this;
                Speaker speaker2 = (Speaker) obj;
                if (speaker1.brand.equals(speaker2.brand) && speaker1.price == speaker2.price) {
                    System.out.println("Same brand and price");
                    return true;
                }
            }
        }
        return false;
    }

}
