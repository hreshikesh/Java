package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Insect;

public class FlyingInsect extends Insect
{
    @Override
    public void bite(){
        System.out.println("FlyingInsect Bitr");
    }


    public void fly(){
        System.out.println("Insect Flying");
    }

}
