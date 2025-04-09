package com.xworkz.tostring.Internal;

public class Park {
    private String name;
    private String location;
    private int area;

    public Park(String name, String location, int area) {
        this.name = name;
        this.location = location;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Park name " + this.name + " location " + this.location + " area " + this.area + " mtrs";
    }
}
