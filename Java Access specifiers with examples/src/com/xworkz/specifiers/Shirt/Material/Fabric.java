package com.xworkz.specifiers.Shirt.Material;

public class Fabric {
    public String fabricType;
    private String quality;
    String color;

    public Fabric(String fabricType, String quality, String color) {
        this.fabricType = fabricType;
        this.quality = quality;
        this.color = color;
    }

    private void checkFabricQuality() {
        System.out.println("Fabric Quality: " + this.quality);
    }

    public void fabricDetails() {
        System.out.println("Fabric Type: " + this.fabricType);
        System.out.println("Fabric Color: " + this.color);
        checkFabricQuality();
    }
    void fabric(){
        System.out.println("Running fabric");
    }
}
