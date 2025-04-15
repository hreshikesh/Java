package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.WashingMachine;

public class SamsungWashingMachine extends WashingMachine {
    @Override
    public void washCloth(){
        System.out.println("Washing cloth in samsung washing machine");
    }
}
