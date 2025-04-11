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
    @Override
    public int hashCode() {
        return -9585;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Samosa) {
                Samosa s1 = this;
                Samosa s2 = (Samosa) obj;
                if (s1.cost == s2.cost) {
                    System.out.println("Same cost");
                    return true;
                }
            }
        }
        return false;
    }
}
