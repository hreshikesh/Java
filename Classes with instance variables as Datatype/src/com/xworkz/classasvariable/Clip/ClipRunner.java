package com.xworkz.classasvariable.Clip;

public class ClipRunner {
    public static void main(String[] args) {
        Clip clip1=new Clip();
        clip1.color="red";
        Clip clip2=new Clip();
        clip2.color="yellow";
        Clip clip3=new Clip();
        clip3.color="silver";
        Clip clip4=new Clip();
        clip4.color="gold";


        Clip[] clips={clip1,clip2,clip3,clip4};


        Puspha puspha=new Puspha();
        puspha.clip=clips;
        puspha.useClip();




    }


}
