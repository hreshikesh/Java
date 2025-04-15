package com.xworkz.OOPS.TypesOfInheritence.SingleLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.SingleLevel.Internal.Brush;

public class ToothBrush extends Brush {
    @Override
    public void clean() {
        System.out.println("Running clean in ToothBrush ");
    }
}
