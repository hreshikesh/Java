package com.xworkz.OOPS.TypesOfInheritence.MultiLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.MultiLevel.Internal.Furniture;

public class Chair extends Furniture {
    @Override
    public void place() {
        System.out.println("Placinf Chair");
    }
}
