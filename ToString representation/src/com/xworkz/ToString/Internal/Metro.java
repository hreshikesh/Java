package com.xworkz.ToString.Internal;

public class Metro {
    private String city;
    private String lineColor;
    private int ticketPrice;

    public Metro(String city, String lineColor, int ticketPrice) {
        this.city = city;
        this.lineColor = lineColor;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Metro city " + this.city + " line color " + this.lineColor + " ticket price " + this.ticketPrice;
    }
    @Override
    public int hashCode() {
        return -78;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Metro) {
                Metro metro1 = this;
                Metro metro2 = (Metro) obj;
                if (metro1.ticketPrice == metro2.ticketPrice) {
                    System.out.println("Same ticket price");
                    return true;
                }
            }
        }
        return false;
    }

}
