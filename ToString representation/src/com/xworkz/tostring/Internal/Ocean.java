package com.xworkz.tostring.Internal;

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
}
