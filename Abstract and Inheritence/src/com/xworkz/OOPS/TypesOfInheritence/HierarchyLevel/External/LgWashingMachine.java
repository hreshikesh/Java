package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.WashingMachine;

public class LgWashingMachine extends WashingMachine {
    @Override
    public void washCloth(){
        System.out.println("Washing cloth in LG washing machine");
    }
}
