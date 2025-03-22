package com.xworkz.references;

public class States {
    String stateName;
    District[] district;

    States(String stateName,District[] district){
        this.stateName=stateName;
        this.district=district;
    }
    void stateDisplay(){
        System.out.println("State name "+this.stateName);
    for(District ref:this.district)
            if(ref!=null){
                ref.districtDisplay();

            }
            else System.err.println("pointing to null");

    }
}
