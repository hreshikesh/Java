package com.xworkz.tostring.Internal;

public class Rice {
    private String type;
    private int quantityInKg;
    private int price;

    public Rice(String type, int quantityInKg, int price) {
        this.type = type;
        this.quantityInKg = quantityInKg;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Rice type: " + type + ", quantity: " + quantityInKg + "kg, price: " + price;
    }

}

