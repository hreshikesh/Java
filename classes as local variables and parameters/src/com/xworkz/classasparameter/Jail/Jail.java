package com.xworkz.classasparameter.Jail;

public class Jail {
    private String name;
    private String location;
    private String jailerName;
    private int totalCells;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getLocation(){
        return this.location;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public String getJailerName(){
        return this.jailerName;
    }
    public void setJailerName(String jailerName){
        this.jailerName=jailerName;
    }
    public int getTotalCells(){
        return this.totalCells;
    }
    public void setTotalCells(int totalCells){
        this.totalCells=totalCells;
    }
}
