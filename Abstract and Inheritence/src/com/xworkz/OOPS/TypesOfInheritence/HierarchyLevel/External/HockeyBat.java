package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.Bat;

public class HockeyBat extends Bat {
    @Override
    public void hit(){
        System.out.println("Hit in HockeyBat");
    }
}
