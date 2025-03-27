package com.xworkz.relation;

public class Button {
    private Material material;
    private String buttonFunction;
    private int buttonNo;

    Button(Material material,String buttonFunction,int buttonNo){
        this.material=material;
        this.buttonFunction=buttonFunction;
        this.buttonNo=buttonNo;
    }

    void press(){
        System.out.println("---------------------------");
        System.out.println("Running button ");
        material.check();
        System.out.println("Button Function "+this.buttonFunction);
        System.out.println("Button No "+this.buttonNo);
    }
}
