package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.Fan;

public class WallFan  extends Fan {
    @Override
    public void rotate(){
        System.out.println("WallFan Rotating");
    }
}
