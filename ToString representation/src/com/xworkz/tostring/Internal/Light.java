package com.xworkz.tostring.Internal;

public class Light {
    private String company;
    private  String type;
    private int cost;

    public Light(String company,String type,int cost){
        this.company=company;
        this.cost=cost;
        this.type=type;
    }

    @Override
    public String toString() {
        return "Light company "+this.company+" Light cost "+this.cost+" Light Type "+this.type;
    }
    @Override
    public int hashCode() {
        return -57;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Light) {
                Light light1 = this;
                Light light2 = (Light) obj;
                if (light1.cost == light2.cost) {
                    System.out.println("Same cost");
                    return true;
                }
            }
        }
        return false;
    }

}
