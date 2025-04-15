package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.BrandedBag;

public class SchoolBrandedBag extends BrandedBag {
    @Override
    public void wearBag(){
        System.out.println("Wearing School Bag");
    }

    public void capcity(){
        System.out.println("Capacity of School Bag");
    }
}
