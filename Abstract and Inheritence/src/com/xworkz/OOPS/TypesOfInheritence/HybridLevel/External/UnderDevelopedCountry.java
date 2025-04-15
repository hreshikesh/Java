package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Country;

public class UnderDevelopedCountry extends Country {
    @Override
    public void population(){
        System.out.println("Running Population in underDevelopedcountry");
    }

    public void development(){
        System.out.println("Running development in undevelpedcountry");
    }
}
