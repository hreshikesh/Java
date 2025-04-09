package com.xworkz.tostring.Internal;

public class Language {
    private String name;
    private String areaUsed;
    private int age;

    public Language(String name,String areaUsed,int age){
        this.name=name;
        this.areaUsed=areaUsed;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Language name "+this.name+" Language used "+this.areaUsed+" Language age "+this.age;
    }
}
