package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Country;

public class DevelopedCountry extends Country {
    @Override
    public void population(){
        System.out.println("Running Population in Developedcountry");
    }
}
