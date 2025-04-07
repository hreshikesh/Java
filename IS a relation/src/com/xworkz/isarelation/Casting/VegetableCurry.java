package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Brinjal;
import com.xworkz.isarelation.Internal.Vegetable;

public class VegetableCurry {
    public void eatCurry(Vegetable vegetable){
        vegetable.steam();
        vegetable.sell();
        vegetable.curry();
        vegetable.chew();
        vegetable.cook();
        System.out.println("-------------------");

        if(vegetable instanceof Brinjal){
            System.out.println("IN Brinjal");
            Brinjal brinjal=(Brinjal) vegetable;
            brinjal.cut();
        }
    }
}
