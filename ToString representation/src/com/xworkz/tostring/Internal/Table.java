package com.xworkz.tostring.Internal;

public class Table {
    private String shape;
    private String material;
    private int price;
    public Table(String shape, String material, int price) {
        this.shape = shape;
        this.material = material;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Table shape " + this.shape + " material " + this.material + " price " + this.price;
    }
}
