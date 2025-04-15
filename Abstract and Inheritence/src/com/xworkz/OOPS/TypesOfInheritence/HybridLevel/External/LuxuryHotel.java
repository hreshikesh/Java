package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Hotel;

public class LuxuryHotel extends Hotel {
    @Override
    public void book(){
        System.out.println("Booking luxury hotel");
    }

    public void getPrice(){
        System.out.println("price of luxury hotel");
    }
}
