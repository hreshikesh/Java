package com.xworkz.relation;

public class Material {
    private String materialType;
    private String materialDurability;

    Material(String materialType,String materialDurability){
        this.materialType=materialType;
        this.materialDurability=materialDurability;
    }

    void check(){
        System.out.println("Running Material");
        System.out.println("Material Type "+this.materialType);
        System.out.println("Material Durability "+this.materialDurability);
    }
}
