package com.xworkz.relation;

public class Wire {
    private Quality quality;
    private String wireMaterial;
    private int wirePrice;

    Wire(Quality quality, String wireMaterial, int wirePrice){
        this.quality=quality;
        this.wireMaterial=wireMaterial;
        this.wirePrice=wirePrice;
    }


    void connect(){
        System.out.println("---------------------------");
        System.out.println("Runnig wire");
        System.out.println("Wire material "+this.wireMaterial);
        this.quality.inspect();
        System.out.println("Wire Price "+this.wirePrice);
    }
}
