package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Charcoal;
import com.xworkz.isarelation.Internal.Coal;

public class Brush {
    public void whitening(Coal coal){
        coal.burn();
        coal.generateEnergy();
        coal.carbonContent();
        coal.extraction();
        coal.usage();
        if(coal instanceof Charcoal){
            System.out.println("IN charcoal");
            Charcoal charcoal=(Charcoal) coal;
            charcoal.toothPaste();
        }
    }
}
