package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return -98752;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Park) {
                Park park1 = this;
                Park park2 = (Park) obj;
                if (park1.area == park2.area) {
                    System.out.println("Same area");
                    return true;
                }
            }
        }
        return false;
    }
}
