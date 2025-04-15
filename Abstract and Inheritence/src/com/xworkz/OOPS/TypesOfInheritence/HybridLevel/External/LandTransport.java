package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Transport;

public class LandTransport extends Transport {
    @Override
    public void travel(){
        System.out.println("Travelling in Transport");
    }

    public void ticket(){
        System.out.println("Showing ticket  in land transport");
    }
}

