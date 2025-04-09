package com.xworkz.tostring.Internal;

public class USB {
    private String brand;
    private int storageCapacity;
    private String type;

    public USB(String brand, int storageCapacity, String type) {
        this.brand = brand;
        this.storageCapacity = storageCapacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Usb brand: " + brand + " storageCapacity: " + storageCapacity + " type: " + type;
    }

}
