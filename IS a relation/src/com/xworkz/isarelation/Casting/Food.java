package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.CoconutOil;
import com.xworkz.isarelation.Internal.Oil;

public class Food {
    public void oily(Oil oil){
        oil.extract();
        oil.store();
        oil.cook();
        oil.viscosity();
        oil.use();
        if(oil instanceof CoconutOil){
            System.out.println("In Coconut Oil");
            CoconutOil coconutOil=new CoconutOil();
            coconutOil.massage();
        }


    }
}
