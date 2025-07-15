package com.xworkz.collection.Map.Iterator.Runner;

import com.xworkz.collection.Map.Iterator.dto.BagDto;

import java.util.HashMap;
import java.util.Map;

public class BagRunner {
    public static void main(String[] args) {
        Map<BagDto,Integer> bagMap=new HashMap<>();

        bagMap.put(new BagDto("SkyBag","red",1599.99,"College Bag",24.4,"Plastic","no",3,"unisex",10),455679);
        bagMap.put(new BagDto("HPBag","White",1299.99,"laptop Bag",11,"Polyster","yes",2,"male",15),422679);
        bagMap.put(new BagDto("ScoobeDoo","blue",699.99,"School Bag",25,"Polyster","no",3,"unisex",18),433679);
        bagMap.put(new BagDto("Wildcraft","green",1199.99,"College Bag",24.4,"Polyster","yes",3,"unisex",10),444679);
        bagMap.put(new BagDto("Star Bags","navy Blue",599.99,"ladies Bag",25,"Rubber","yes",3,"female",10),466679);

        for(Map.Entry<BagDto,Integer> map:bagMap.entrySet()){
            System.out.println("bag Id"+map.getValue()+"bag details "+map.getKey());        }






    }
}
