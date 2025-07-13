package com.xworkz.collection.List.Collectionwithdto.Runner;

import com.xworkz.collection.List.Collectionwithdto.dto.PoliceDto;

import java.util.ArrayList;
import java.util.Collection;

public class PoliceRunner {
    public static void main(String[] args) {
        Collection<PoliceDto> policeCollection=new ArrayList<>();
        policeCollection.add(new PoliceDto("Ravi", "Bannargatta Police Station", "Bangalore", "Inspector", 35, "Traffic", 50000));
        policeCollection.add(new PoliceDto("Anil", "Chandralayput Police Station", "Bangalore", "Sub Inspector", 30, "Cyber Crime", 45000));
        policeCollection.add(new PoliceDto("Kumar", "Jayanagar Police Station", "Bangalore", "Constable", 28, "Local", 30000));
        policeCollection.add(new PoliceDto("Suresh", "Koramangala Police Station", "Bangalore", "Inspector", 40, "Local", 60000));
        policeCollection.add(new PoliceDto("Ramesh", "Indiranagar Police Station", "Bangalore", "Sub Inspector", 32, "Drug", 48000));
        policeCollection.add(new PoliceDto("Vijay", "MG Road Police Station", "Bangalore", "Constable", 26, "People Control", 28000));
        policeCollection.add(new PoliceDto("Sanjay", "BTM Layout Police Station", "Bangalore", "Inspector", 38, "Traffic", 52000));
        policeCollection.add(new PoliceDto("Prakash", "BTM Layout Police Station", "Bangalore", "Sub Inspector", 33, "Cyber Crime", 47000));
        policeCollection.add(new PoliceDto("Manoj", "JP Nagar Police Station", "Bangalore", "Constable", 29, "Local", 31000));
        policeCollection.add(new PoliceDto("Ajay", "KSR Police Station", "Bangalore", "Inspector", 36, "Railway", 55000));
//        PoliceDto policeDt=new PoliceDto();
//        policeDt.setAge(10);
//        policeCollection.add(policeDt);



        for(PoliceDto policeDto:policeCollection){
            System.out.println("Police Name: " + policeDto.getPoliceName() + ", Police Station: " + policeDto.getPoliceStation() + ", Place: " + policeDto.getPlace() + ", Position: " + policeDto.getPosition() + ", Age: " + policeDto.getAge() + ", Branch: " + policeDto.getBranch() + ", Salary: " + policeDto.getSalary());
            System.out.println("--------------------------------------------------");
        }
    }
}
