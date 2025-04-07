package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Medicine;
import com.xworkz.isarelation.Internal.Tablet;

public class Sickness {
    public void treat(Medicine medicine){
        medicine.cure();
        medicine.dosage();
        medicine.store();
        medicine.manufacture();
        medicine.expiryDate();
        if(medicine instanceof Tablet){
            System.out.println("In Tablet");
            Tablet tablet=(Tablet) medicine;
            tablet.overDose();
        }
    }
}
