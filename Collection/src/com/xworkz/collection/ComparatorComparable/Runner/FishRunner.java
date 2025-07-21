package com.xworkz.collection.ComparatorComparable.Runner;

import com.xworkz.collection.ComparatorComparable.dto.FishDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FishRunner {
    public static void main(String[] args) {

        List<FishDto> fishDtoList=new ArrayList<>();
        fishDtoList.add(new FishDto(500,"Angel"));
        fishDtoList.add(new FishDto(100,"Bangda"));
        fishDtoList.add(new FishDto(50,"Boothayi"));
        fishDtoList.add(new FishDto(1000,"Manji"));

        Collections.sort(fishDtoList);


        System.out.println(fishDtoList);


    }
}
