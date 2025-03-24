package com.xworkz.specifiers.Mobile.Mobile;

import com.xworkz.specifiers.Mobile.Charger.Charger;
import com.xworkz.specifiers.Mobile.Charger.ChargerType;

public class MobileRunner {
    public static void main(String[] args) {
        Charger charger=new Charger("MI",1500,"China");
        ChargerType chargerType=new ChargerType();
        chargerType.charging(charger);
        chargerType.chargerType="C-Type";

        Samsung samsung=new Samsung("A10",1214562555);
        samsung.mobileDisplay();


    }
}
