package com.xworkz.classasparameter.Alien;

public class Ufo {
    public void fly(Alien alien){
        if(alien!=null){
            System.out.println("Alien seenby "+alien.getSeenby());
        }else System.err.println("Pointing to null");

    }

    public void land(Alien[] aliens){
        if(aliens!=null){
            for(Alien alien:aliens){
                System.out.println("The alien describe "+alien.getDescribe());
            }
        }

    }

    public void caught(){
        Alien alien=new Alien();
        alien.setSeenDate("12-12-12");
        System.out.println("The alien was seen date:"+alien.getSeenDate());
    }

    public void spot(){
        Alien alien1=new Alien();
        alien1.setSeenby("Vaibhav");
        Alien alien2=new Alien();
        alien2.setSeenby("Chaitanya");
        Alien[] aliens={alien1,alien2};
        for(Alien alien:aliens){
            System.out.println("The aliens spotted by "+alien.getSeenby());
        }
    }
}
