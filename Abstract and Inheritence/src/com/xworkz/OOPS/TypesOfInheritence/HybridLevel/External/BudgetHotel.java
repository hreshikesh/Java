package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Hotel;

public class BudgetHotel extends Hotel {
    @Override
    public void book(){
        System.out.println("Booking budget hotel");
    }
}
