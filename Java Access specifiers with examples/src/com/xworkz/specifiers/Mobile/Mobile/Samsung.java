package com.xworkz.specifiers.Mobile.Mobile;

import com.xworkz.specifiers.Mobile.Charger.ChargerType;

public class Samsung {
    public String deviceName;
    private int imeiNO;
    public Samsung(String deviceName,int imeiNO){
        this.deviceName=deviceName;
        this.imeiNO=imeiNO;
    }

    void mobileDisplay(){
        System.out.println("Device Name "+this.deviceName+"IMEIno "+this.imeiNO);

    }

}
