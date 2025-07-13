package com.xworkz.collection.List.LinkedList.Runner;

import com.xworkz.collection.List.LinkedList.Node.LaptopNode;
import com.xworkz.collection.List.LinkedList.dto.LaptopDto;



public class LaptopRunner {
    public static void main(String[] args) {

        LaptopNode laptopNode=new LaptopNode(new LaptopDto("ASUSTUFF15",150000,"Asus"),null);
        LaptopNode laptopNode1=new LaptopNode(new LaptopDto("HP Victus",250000,"HP"),laptopNode);
        LaptopNode laptopNode2=new LaptopNode(new LaptopDto("DEll G15",85000,"Dell"),laptopNode1);
        LaptopNode laptopNode3=new LaptopNode(new LaptopDto("DEll gaming",88880,"Dell"),laptopNode2);
//since the fist node is pointing to nullso we cannot acess from node 1 we acess from the last node
        LaptopNode present=laptopNode3;
        while (present!=null){
            System.out.print(present.getLaptopDto().getLaptopName()+"-->");

            present=present.getLaptopNode();


        }


    }
}
