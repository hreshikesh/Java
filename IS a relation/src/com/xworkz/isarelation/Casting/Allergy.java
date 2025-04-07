package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Drop;
import com.xworkz.isarelation.Internal.EyeDrop;

public class Allergy {
    public void  clean(Drop drop){
        drop.liquidType();
        drop.volume();
        drop.use();
        drop.absorption();
        drop.dispense();
        if(drop instanceof EyeDrop){
            System.out.println("In EyeDrop");
            EyeDrop eyeDrop=(EyeDrop) drop;
            eyeDrop.cure();
        }

    }
}
