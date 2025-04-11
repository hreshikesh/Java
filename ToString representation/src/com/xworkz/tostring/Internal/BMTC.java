package com.xworkz.tostring.Internal;

public class BMTC {
    private String cityName;
    private String route;
    private int minimumCost;

    public BMTC(String cityName, String route, int minimumCost) {
        this.cityName = cityName;
        this.route = route;
        this.minimumCost = minimumCost;
    }

    @Override
    public String toString() {
        return "BMTC city " + this.cityName + " BMTC route " + this.route + " Pant MinimumCost " + this.minimumCost;
    }

    @Override
    public int hashCode() {
        return 100;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof BMTC) {
                BMTC b1 = this;
                BMTC b2 = (BMTC) obj;
                if (b1.minimumCost == b2.minimumCost) {
                    System.out.println("Same minimum cost");
                    return true;
                }
            }
        }
        return false;
    }

}


