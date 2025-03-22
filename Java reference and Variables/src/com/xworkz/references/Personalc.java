package com.xworkz.references;

public class Personalc {
    String pName;
    Skill skill;
    States state;
    Personalc (String pName,Skill skill,States state){
        this.pName=pName;
        this.skill=skill;
        this.state=state;
    }
    void personalDisplay(){
        System.out.println("Personal name "+this.pName);
        if(this.skill!=null){
            this.skill.skillDisplay();
        }if(this.state!=null){
            state.stateDisplay();
        }
        else System.err.println("pointing to null");

    }
}
