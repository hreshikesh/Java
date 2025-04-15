package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;


public class AsianCountry extends UnderDevelopedCountry {
    @Override
    public void population() {
        System.out.println("Running Population in  AsianCountry ");
    }

    @Override
    public void development() {
        System.out.println("Running development in AsianCountry");
    }
}
