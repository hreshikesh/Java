package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.MultiLevel.External.Lays;

public class Train extends LandTransport {
    @Override
    public void travel() {
        System.out.println("Travelling in Train");
    }

    @Override
    public void ticket() {
        System.out.println("Showing ticket  in  train");
    }
}
