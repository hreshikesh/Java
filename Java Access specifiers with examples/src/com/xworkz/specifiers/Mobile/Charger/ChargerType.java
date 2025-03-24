package com.xworkz.specifiers.Mobile.Charger;

import java.security.PublicKey;

public class ChargerType {
    Charger charger;
    public String chargerType;
    private void chargerType(){
        System.out.println("The charger Type is"+this.chargerType);
    }

    public void charging( Charger charger){
        charger.time();
        charger.charge();
        chargerType();
    }
}
