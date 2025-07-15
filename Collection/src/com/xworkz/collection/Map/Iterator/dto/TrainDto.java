package com.xworkz.collection.Map.Iterator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@AllArgsConstructor
@ToString
@Getter
@Setter
public class TrainDto implements Serializable {
    private String trainCategory;
    private String source;
    private String destination;
    private String coachType;
    private int pnrNumber;
    private String trainType;
    private int noOfPassenger;
    private String travelDuration;
    private int price;
    private String seatType;

}
