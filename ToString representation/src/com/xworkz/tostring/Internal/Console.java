package com.xworkz.tostring.Internal;

public class Console {
    private String name;
    private String manufacturer;
    private int price;

    public Console(String name, String manufacturer, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Console name " + this.name + " manufacturer " + this.manufacturer + " price " + this.price;
    }

}
