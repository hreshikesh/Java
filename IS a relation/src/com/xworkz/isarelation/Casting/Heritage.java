package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Country;
import com.xworkz.isarelation.Internal.India;

public class Heritage {
    public void explore(Country country){
        country.continent();
        country.population();
        country.government();
        country.currency();
        country.language();
        if(country instanceof India){
            System.out.println("In India");
            India india=(India) country;
            india.culture();
        }
    }
}
