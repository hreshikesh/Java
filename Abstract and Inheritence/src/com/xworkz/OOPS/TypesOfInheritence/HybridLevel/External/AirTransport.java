package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Transport;

public class AirTransport  extends Transport {
    @Override
    public void travel(){
        System.out.println("Travelling in  air  Transport");
    }
}
