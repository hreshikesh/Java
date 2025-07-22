package com.xworkz.instance.external;

import lombok.*;

import java.io.Serializable;


@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Race implements Cloneable, Serializable {
    private String raceName;
    private int noOfParticipants;
    private String location;

    public void getRaceInfo(){
        System.out.println("Race detials in race class"+toString());

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
