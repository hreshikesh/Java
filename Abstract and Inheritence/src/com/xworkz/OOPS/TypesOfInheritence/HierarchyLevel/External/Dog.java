package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.Animal;

public class Dog extends Animal {
    @Override
    public void chase() {
        System.out.println("Dog Chasing");
    }
}
