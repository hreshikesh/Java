package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Plant;
import com.xworkz.isarelation.Internal.Tree;

public class Forest {
    public void deforstation(Plant plant){
        plant.grow();
        plant.absorbSunlight();
        plant.photosynthesize();
        plant.reproduce();
        plant.consumeWater();
        if(plant instanceof Tree){
            System.out.println("In Tree");
            Tree tree =(Tree) plant;
            tree.cutDown();
        }
    }
}
