package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.Animal;

public class Tiger extends Animal {
    @Override
    public void chase() {
        System.out.println("Tiger Chasing");
    }
}
