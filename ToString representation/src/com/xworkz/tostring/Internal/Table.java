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
    @Override
    public int hashCode() {
        return -2004;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Table) {
                Table table1 = this;
                Table table2 = (Table) obj;
                if (table1.shape.equals(table2.shape) && table1.material.equals(table2.material)) {
                    System.out.println("Same shape and material");
                    return true;
                }
            }
        }
        return false;
    }

}
