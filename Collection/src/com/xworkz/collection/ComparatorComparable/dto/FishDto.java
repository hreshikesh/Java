package com.xworkz.collection.ComparatorComparable.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class FishDto implements Comparable<FishDto> {
    private int price;
    private String fishName;

//    @Override
//    public int compareTo(FishDto o) {
//        if(o.getPrice()<this.getPrice()) return 1;
//        else if (o.getPrice()==this.getPrice()) return 0;
//        else return -1;
//    }
    @Override
    public int compareTo(FishDto o) {
       return Integer.compare(o.getPrice(),this.getPrice());
    }
}
