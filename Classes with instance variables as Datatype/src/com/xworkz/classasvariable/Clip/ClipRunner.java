package com.xworkz.classasvariable.Clip;

public class ClipRunner {
    public static void main(String[] args) {
        Clip[] clip=new Clip[5];
        for(int i=0;i<5;i++){
            clip[i]=new Clip();
        }

        Puspha puspha=new Puspha();
        puspha.clip=clip;
        puspha.useClip();




    }


}
