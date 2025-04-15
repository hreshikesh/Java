package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

public class RajMahalHotel extends LuxuryHotel {
    @Override
    public void book() {
        System.out.println("Booking Rajmahal hotel");
    }

    @Override
    public void getPrice() {
        System.out.println("price of Rajmahal hotel");
    }
}
