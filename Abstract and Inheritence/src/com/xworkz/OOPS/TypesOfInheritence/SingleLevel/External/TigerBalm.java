package com.xworkz.OOPS.TypesOfInheritence.SingleLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.SingleLevel.Internal.Balm;

public class TigerBalm extends Balm {
    @Override
    public void cure() {
        System.out.println("Cure in Tigerbalm");
    }
}
