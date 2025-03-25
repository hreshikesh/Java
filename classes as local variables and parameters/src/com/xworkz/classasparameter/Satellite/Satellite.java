package com.xworkz.classasparameter.Satellite;

public class Satellite {
    private SatelliteType type;
    private int cost;
    private int weight;
    private int loadcapacity;

    public SatelliteType getType(){
        return this.type;
    }
    public void setType(SatelliteType type){
        this.type=type;
    }
    public int getCost(){
        return this.cost;
    }
    public void setCost(int cost){
        this.cost=cost;
    }
    public int getWeight(){
        return this.weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public int getLoadcapacity(){
        return this.loadcapacity;
    }
    public void setLoadcapacity(int loadcapacity){
        this.loadcapacity=loadcapacity;
    }

}
