package com.xworkz.OOPS.TypesOfInheritence.MultiLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.MultiLevel.Internal.Food;

public class Chapati extends Food {
    @Override
    public void prepare() {
        System.out.println("Prepare Chapati");
    }

    public void eat(){
        System.out.println("Eat Chapati");
    }
}
