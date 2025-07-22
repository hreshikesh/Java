package com.xworkz.instance.external;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@ToString
@Setter
public class Fish implements Cloneable, Serializable {
    private String fishName;
    private int fishPrice;
    private char fishGrade;

    public void getFish(){
        System.out.println("Fish NAme "+this.fishName);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
