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
    @Override
    public int hashCode() {
        return 240000;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Console) {
                Console c1 = this;
                Console c2 = (Console) obj;
                if (c1.manufacturer.equals(c2.manufacturer)) {
                    System.out.println("Same manufacturer");
                    return true;
                }
            }
        }
        return false;
    }

}
