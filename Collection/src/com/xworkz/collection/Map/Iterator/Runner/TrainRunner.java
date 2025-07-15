package com.xworkz.collection.Map.Iterator.Runner;

import com.xworkz.collection.Map.Iterator.dto.TrainDto;

import java.util.HashMap;
import java.util.Map;

public class TrainRunner {
    public static void main(String[] args) {
        Map<String , TrainDto> trainMap=new HashMap<>();


        trainMap.put("VandeBharath",new TrainDto("Express","mangalore","trivendrum","AC",234566,"Electric",1,"7hrs",2000,"ACseatear"));
        trainMap.put("Masygandha",new TrainDto("Semi-Express","mangalore","Pune","non-Ac",778866,"Electric",1,"17hrs",200,"general"));
        trainMap.put("PrayagRajExpress",new TrainDto("Express","Bangalore","UP","non-AC",789566,"Electric",1,"48hrs",700,"Sleeper"));
        trainMap.put("Netravathi",new TrainDto("Express","mangalore","trivendrum","AC",245666,"Electric",1,"7hrs",2500,"ACSleeper"));
        trainMap.put("Amgel travel Exp",new TrainDto("Local","mangalore","Karwar","Non-AC",908566,"deisel",1,"5hrs",250,"Sleeper"));


        for(Map.Entry<String,TrainDto> map:trainMap.entrySet()){
            System.out.println("Tarin Name:"+map.getKey()+"train Details "+map.getValue());
        }




    }
}
