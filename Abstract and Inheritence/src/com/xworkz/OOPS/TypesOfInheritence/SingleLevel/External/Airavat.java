package com.xworkz.OOPS.TypesOfInheritence.SingleLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.SingleLevel.Internal.Bus;

public class Airavat extends Bus {

    @Override
    public void drop() {
        System.out.println("Running drop in Airavat");
    }
}
