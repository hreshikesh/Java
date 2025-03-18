package com.xworkz.classparameter.Poster;

public class Theater {
    public void show(Poster poster){
        System.out.println("Running Theater");
        if(poster!=null) {
            poster.showInfo();
        }
        else{
            System.out.println("poster pointing to null");
        }
    }
}
