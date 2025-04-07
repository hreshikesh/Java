package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Furniture;
import com.xworkz.isarelation.Internal.Sofa;

public class WatchMovie {
    public void hindiMovie(Furniture furniture){
        furniture.pillow();
        furniture.fold();
        furniture.comfort();
        furniture.cusion();
        furniture.sleep();
        if(furniture instanceof Sofa){
            System.out.println("in Sofa");
            Sofa sofa=(Sofa) furniture;
            sofa.place();
        }

    }
}
