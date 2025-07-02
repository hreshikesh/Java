package com.xworkz.collection.Arraylist.Collectionwithdto.Runner;

import com.xworkz.collection.Arraylist.Collectionwithdto.dto.BusDto;

import java.util.ArrayList;
import java.util.Collection;

public class BusRunner {

    public static void main(String[] args) {
        Collection<BusDto> busCollection=new ArrayList<>();
        busCollection.add(new BusDto("VRL","Scania","10:45pm",900,"Dhanush","Durgapa","Bang-Man"));
        busCollection.add(new BusDto("SRS","TATA","10:30pm",700,"Vamana","Kodanda","MAng-Bang"));
        busCollection.add(new BusDto("Arjuna","Benz","10:00pm",1900,"Varada","Raghu","Bang-Man"));
        busCollection.add(new BusDto("Suagma","Ashok","9:45pm",800,"Deepak","Ram","Bang-Man"));
        busCollection.add(new BusDto("Sri Durga","TATA","10:10pm",700,"Somayya","Padma","Bang-Man"));
        busCollection.add(new BusDto("Durgamba","Ashok","10:00pm",700,"Annu","Laxman","Bang-Hubli"));
        busCollection.add(new BusDto("KSRTC","Ashok","8:00pm",400,"Damodar","Raj","Man-Karwar"));
        busCollection.add(new BusDto("Airavata","Sacnia","12:00pm",1100,"Deerappa","Vikki","Bang-Man"));
        busCollection.add(new BusDto("Ambaari-Ustav","Benz","10:30pm",1700,"Guru","Prasad","Bang-Man"));
        busCollection.add(new BusDto("Sea Bird","TATA","10:20pm",800,"Lokesh","Ramu","Bang-Sirsi"));


        for(BusDto busDto:busCollection){
            System.out.println("Bus Name "+busDto.getBusName()+" Bus Company "+busDto.getBusCompany()+" Bus Time "+busDto.getBusTime()+" Cost "+busDto.getCost()+" Bus Driver "+busDto.getBusDriver()+" Bus Conductor "+busDto.getBusConductor()+" Bus Route "+busDto.getBusRoute());
            System.out.println("--------------------------------------------------");
        }









    }
}
