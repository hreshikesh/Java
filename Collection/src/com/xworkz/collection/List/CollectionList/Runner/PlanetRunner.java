package com.xworkz.collection.List.CollectionList.Runner;

import com.xworkz.collection.List.CollectionList.dto.PlanetDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class PlanetRunner {
    public static void main(String[] args) {
        List<PlanetDto> planetlist=new ArrayList<>(Arrays.asList(new PlanetDto("120000","Mars",4,"yes"),
                new PlanetDto("1300000","Saturn",6,"no"),
                new PlanetDto("1000000000000","Sun",1,"no")));

        ListIterator<PlanetDto> planetIterator=planetlist.listIterator();
        planetIterator.add(new PlanetDto("0","Earth",3,"stays here"));
        while (planetIterator.hasNext()){
            System.out.println("Planet List "+planetIterator.next());
        }
        System.out.println("--------------------------------");
        ListIterator<PlanetDto> planetIterator1=planetlist.listIterator();
        while (planetIterator1.hasNext()){
            System.out.println("Planet List updated "+planetIterator1.next());

        }

    }




}
