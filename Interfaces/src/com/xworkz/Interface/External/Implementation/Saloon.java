package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.SaloonRule;

public class Saloon implements SaloonRule {
    @Override
    public void saloonServices() {
        System.out.println("Saloon services are available");
    }

    @Override
    public void saloonCustomerCare() {
        System.out.println("Saloon customer care is available");
    }

    @Override
    public void saloonHygiene() {
        System.out.println("Saloon hygiene is maintained");
    }
}
