package com.xworkz.classparameter.Dolo650;

public class Tablet {
    public void getTablet(Dolo dolo){
        if(dolo!=null){
            dolo.doloTablet();
        }
        else{
            System.out.println("Dolo pointing to null");
        }

    }
}
