package com.xworkz.collection.Arraylist.Collectionwithdto.Runner;

import com.xworkz.collection.Arraylist.Collectionwithdto.dto.PgDto;

import java.util.ArrayList;
import java.util.Collection;

public class PgRunner {
    public static void main(String[] args) {
        Collection<PgDto> pgCollection = new ArrayList<>();
        pgCollection.add(new PgDto(10000, "Ravi", "Xworkz PG", "House PG", "Bannargatta", 5000, "Suresh"));
        pgCollection.add(new PgDto(15000, "Anil", "Chndra PG","Room PG", "Chandralayput", 6000, "Ramesh"));
        pgCollection.add(new PgDto(12000, "Kumar", "Shree PG", "Hostel PG", "Jayanagar", 5500, "Rajesh"));
        pgCollection.add(new PgDto(8000, "Suresh", "Sai PG", "Hostel PG", "Koramangala", 4000, "Vijay"));
        pgCollection.add(new PgDto(9000, "Ramesh", "Durga PG", "Apartment PG", "Indiranagar", 4500, "Kiran"));
        pgCollection.add(new PgDto(11000, "Vijay", "Lakshmi PG", "Room PG", "MG Road", 5200, "Sanjay"));
        pgCollection.add(new PgDto(13000, "Sanjay", "Ganesh PG", "House PG", "BTM Layout", 5800, "Prakash"));
        pgCollection.add(new PgDto(14000, "Prakash", "Shiva PG", "Hostel PG", "BTM Layout", 6200, "Manoj"));
        pgCollection.add(new PgDto(16000, "Manoj", "Radha PG", "Apartment PG", "Jayanagar", 7000, "Ajay"));
        pgCollection.add(new PgDto(17000, "Ajay", "Krishna PG", "Room PG", "Koramangala", 7500, "Ravi"));

        for(PgDto pgDto:pgCollection){
            System.out.println("PG Name: " + pgDto.getPgName() + "Place: " + pgDto.getPlace() + "Rent: " + pgDto.getRent() + "Deposit: " + pgDto.getDeposit() + "Owner: " + pgDto.getOwner() + "Wardern: " + pgDto.getWardern() + "PG Type: " + pgDto.getPgType());
            System.out.println("--------------------------------------------------");
        }
    }
}
