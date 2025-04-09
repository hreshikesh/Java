package com.xworkz.tostring.Internal;

public class Samosa {
    private String type;
    private String shape;
    private int cost;

    public Samosa(String type,String shape,int cost){
        this.type=type;
        this.shape=shape;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "Samosa type "+this.type+" Samosa cost "+this.cost+" Samosa shape "+this.shape;
    }
}
