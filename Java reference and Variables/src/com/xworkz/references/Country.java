package com.xworkz.references;

public class Country {
    String name="India";
    String continent="Asia";
    int population=144;
    int states=29;

    PrimeMinister pm=new PrimeMinister();

    void display(){
        System.out.println("Country Details ");
        System.out.println("Country name "+name);
        System.out.println("Country Continent "+continent);
        System.out.println("Country Population "+population);
        System.out.println("Country states "+states);
        System.out.println("================================================");
        if(pm!=null  ) {
            pm.pmDisplay();
        }else System.err.println("Pointing to null");
    }

}
