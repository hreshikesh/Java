package com.xworkz.relation;

public class Quality {

    private String quality;
    private char grade;

    Quality(String quality,char grade){
        this.quality=quality;
        this.grade=grade;
    }
    void inspect(){
        System.out.println("Running Quality");
        System.out.println("Wire Quality "+this.quality);
        System.out.println("Wire Grade "+this.grade);
    }
}
