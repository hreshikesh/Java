package com.xworkz.tostring.Internal;

public class Fan {
    private String type;
    private int cost;
    private int speed;

    public Fan(String type, int cost, int speed){
        this.type=type;
        this.cost=cost;
        this.speed=speed;
    }

    @Override
    public String toString() {
        return "Fan type "+this.type+" Fan cost "+this.cost+" Fan speed "+this.speed;
    }
    @Override
    public int hashCode() {
        return -789;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("obj is not null");{
                if(obj instanceof Fan){
                    Fan fan1=this;
                    Fan fan2=(Fan) obj;
                    if(fan1.cost==fan2.cost){
                        System.out.println("Same cost");
                        return true;
                    }

                }
            }
        }
        return false;
    }
}
