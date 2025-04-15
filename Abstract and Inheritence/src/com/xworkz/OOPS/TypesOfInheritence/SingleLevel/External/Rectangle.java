package com.xworkz.OOPS.TypesOfInheritence.SingleLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.SingleLevel.Internal.Shape;

public class Rectangle extends Shape {


    @Override
    public void fit() {
        System.out.println("Runnning fit in rectangle");
    }
}
