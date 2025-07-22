package com.xworkz.collection.ComparatorComparable.Starting.dto.Runner;

import com.xworkz.collection.ComparatorComparable.Starting.dto.SoapDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SoapRunner {
    public static void main(String[] args) {


//        Comparator<SoapDto> soapDtoComparator=new Comparator<SoapDto>() {
//            @Override
//            public int compare(SoapDto o1, SoapDto o2) {
//                if(o1.getPrice()>o2.getPrice()) return 1;
//                else if (o1.getPrice()==o2.getPrice()) return 0;
//                else return -1;
//            }
//        };

        Comparator<SoapDto> soapDtoComparator=new Comparator<SoapDto>() {
            @Override
            public int compare(SoapDto o1, SoapDto o2) {
                return Integer.compare(o1.getPrice(),o2.getPrice());
            }
        };


        List<SoapDto> soapDtoList=new ArrayList<>();
        soapDtoList.add(new SoapDto(40,"Santoor"));
        soapDtoList.add(new SoapDto(30,"Pears"));
        soapDtoList.add(new SoapDto(20,"Rin"));
        soapDtoList.add(new SoapDto(10,"Vim"));


        Collections.sort(soapDtoList,soapDtoComparator);

        soapDtoList.forEach(e->System.out.println(e));
    }
}
