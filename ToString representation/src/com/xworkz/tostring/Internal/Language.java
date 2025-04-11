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
    @Override
    public int hashCode() {
        return 0;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Language) {
                Language l1 = this;
                Language l2 = (Language) obj;
                if (l1.age == l2.age) {
                    System.out.println("Same age");
                    return true;
                }
            }
        }
        return false;
    }

}
