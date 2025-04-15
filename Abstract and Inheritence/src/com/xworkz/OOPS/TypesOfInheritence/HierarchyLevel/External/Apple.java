package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.Fruit;

public class Apple extends Fruit {
    @Override
    public void juice() {
        System.out.println("Apple Juice");
    }
}
