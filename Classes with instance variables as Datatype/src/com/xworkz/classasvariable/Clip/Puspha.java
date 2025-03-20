package com.xworkz.classasvariable.Clip;

public class Puspha {
    Clip[] clip;
    void useClip(){
        for(Clip ref:clip){
            if(ref!=null){
                ref.hold();
                ref.color();
            }
            System.err.println("Pointing to null");
        }
    }


}
