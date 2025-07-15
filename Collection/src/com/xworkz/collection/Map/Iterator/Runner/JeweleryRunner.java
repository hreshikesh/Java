package com.xworkz.collection.Map.Iterator.Runner;

import com.xworkz.collection.Map.Iterator.dto.JewelwryDto;

import java.util.HashMap;
import java.util.Map;

public class JeweleryRunner {
    public static void main(String[] args) {
        Map<String,JewelwryDto> jewelwryDtoMap=new HashMap<>();
        jewelwryDtoMap.put("Gold Chain",new JewelwryDto("Gold","Chain",20000,"bhima Jewelers","22K"));
        jewelwryDtoMap.put("Platinum Ring",new JewelwryDto("Platinum","Hand Ring",50000,"ANNA Jewelers","15k"));
        jewelwryDtoMap.put("Silver Anklet",new JewelwryDto("Silvrer","leg Accessory",10000,"maamu Jewelers","21k"));
        jewelwryDtoMap.put("Gold EarRing",new JewelwryDto("Gold","Ear ring",50000,"Ayaan Jewelers","24k"));

        for(Map.Entry<String,JewelwryDto> map: jewelwryDtoMap.entrySet()){
            System.out.println("Key:"+map.getKey()+" Value:"+map.getValue());
        }



    }
}
