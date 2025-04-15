package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.Fan;

public class CeilingFan extends Fan {
    @Override
    public void rotate(){
        System.out.println("CeilingFan Rotating");
    }
}
