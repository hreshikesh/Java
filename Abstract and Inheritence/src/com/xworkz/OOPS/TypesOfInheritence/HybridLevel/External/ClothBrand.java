package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Brand;

public class ClothBrand extends Brand {
    @Override
    public void status(){
        System.out.println("Status of Cloth brand");
    }

    public void brandValue(){
        System.out.println("Cloth Brand value");
    }
}
