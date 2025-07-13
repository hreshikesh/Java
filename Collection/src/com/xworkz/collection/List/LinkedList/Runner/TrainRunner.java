package com.xworkz.collection.List.LinkedList.Runner;

import com.xworkz.collection.List.LinkedList.Node.TrainNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TrainRunner {

    public static void main(String[] args) {

//        LinkedList<String> trainList=new LinkedList<>();
//        trainList.add("Masyagandha");
//        trainList.add("Rajadhanai");
//        trainList.add("Mani");
//
////        trainList.addFirst("Karwar Express");
////        trainList.addLast("Murudeshwar Express");
//
//        trainList.forEach(e-> System.out.println("Train Details "+e));

        TrainNode trainNode=new TrainNode("Masyagandha");
        TrainNode trainNode1=new TrainNode("Rajasthan Express");
        TrainNode trainNode2=new TrainNode("Seethaphal Exp");

        trainNode.setAddress(trainNode1);
        trainNode1.setAddress(trainNode2);


        TrainNode present=trainNode;

        while (present!=null){
            System.out.print(present.getData()+"-->");
            present=present.getAddress();

        }
















    }
}
