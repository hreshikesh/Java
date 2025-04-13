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
    @Override
    public int hashCode() {
        return -10005;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof USB) {
                USB usb = this;
                USB usb1 = (USB) obj;
                if (usb.brand.equals(usb1.brand) && usb.storageCapacity == usb1.storageCapacity && usb.type.equals(usb1.type)) {
                    System.out.println("Same brand, storageCapacity, and type");
                    return true;
                }
            }
        }
        return false;
    }

}
