package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Element;
import com.xworkz.isarelation.Internal.Fire;

public class FireFighters {
    public void extinguish(Element element){
        element.existInNature();
        element.combineWithOtherElements();
        element.hasAtomicStructure();
        element.classifiedByType();
        element.periodicTablePresence();
        if(element instanceof Fire){
            System.out.println("In Fire");
            Fire fire = (Fire) element;
            fire.burn();
        }
    }
}
