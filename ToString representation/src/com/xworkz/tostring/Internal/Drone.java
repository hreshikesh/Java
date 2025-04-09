package com.xworkz.tostring.Internal;

public class Drone {
    private String brand;
    private String cameraQuality;
    private int price;

    public Drone(String brand, String cameraQuality, int price) {
        this.brand = brand;
        this.cameraQuality = cameraQuality;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drone brand " + this.brand + " cameraQuality " + this.cameraQuality + " price " + this.price;
    }
}
