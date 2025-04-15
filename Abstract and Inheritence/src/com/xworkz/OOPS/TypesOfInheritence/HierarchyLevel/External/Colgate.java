package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.ToothPaste;

public class Colgate extends ToothPaste {
    @Override
    public void brush(){
        System.out.println("Brushing in Colgate ToothPaste");

    }
}
