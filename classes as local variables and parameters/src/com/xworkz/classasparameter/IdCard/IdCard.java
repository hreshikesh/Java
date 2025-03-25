package com.xworkz.classasparameter.IdCard;

public class IdCard {
    private String material;
    private String colors[];
    private int weight;
    private String designedBy;

    public String getMaterial(){
        return this.material;
    }
    public void setMaterial(String material){
        this.material=material;
    }

    public String[] getColor(){
        return this.colors;
    }
    public void setColors(String[] colors){
        this.colors=colors;
    }

    public int getWeight(){
        return this.weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }

    public String getDesignedBy(){
        return this.designedBy;
    }
    public void setDesignedBy(String designedBy ){
        this.designedBy=designedBy;
    }




}
