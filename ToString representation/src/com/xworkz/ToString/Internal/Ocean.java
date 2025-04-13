package com.xworkz.ToString.Internal;

public class Ocean {
    private String name;
    private int depth;
    private int area;

    public Ocean(String name, int depth, int area) {
        this.name = name;
        this.depth = depth;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Ocean name: " + this.name + ", depth: " + this.depth + " meters, area: " + this.area + " sq km";
    }
    @Override
    public int hashCode() {
        return -9875;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Ocean) {
                Ocean ocean1 = this;
                Ocean ocean2 = (Ocean) obj;
                if (ocean1.name.equals(ocean2.name) &&
                        ocean1.depth == ocean2.depth &&
                        ocean1.area == ocean2.area) {
                    System.out.println("Same name, depth, and area");
                    return true;
                }
            }
        }
        return false;
    }

}
